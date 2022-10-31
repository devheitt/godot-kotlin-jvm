package godot.intellij.plugin.annotator.reference

import com.intellij.lang.annotation.AnnotationHolder
import godot.intellij.plugin.GodotPluginBundle
import godot.intellij.plugin.data.model.REGISTER_FUNCTION_ANNOTATION
import godot.intellij.plugin.data.model.RPC_ANNOTATION
import godot.intellij.plugin.extension.registerProblem
import godot.intellij.plugin.quickfix.TargetFunctionHasNoRpcAnnotationQuickFix
import godot.intellij.plugin.quickfix.TargetFunctionNotRegisteredQuickFix
import godot.intellij.plugin.quickfix.TargetFunctionsRpcAnnotationHasRpcModeDisabled
import org.jetbrains.kotlin.idea.base.utils.fqname.getKotlinFqName
import org.jetbrains.kotlin.idea.util.findAnnotation
import org.jetbrains.kotlin.name.FqName
import org.jetbrains.kotlin.nj2k.postProcessing.resolve
import org.jetbrains.kotlin.psi.KtCallExpression
import org.jetbrains.kotlin.psi.KtCallableReferenceExpression
import org.jetbrains.kotlin.psi.KtNameReferenceExpression
import org.jetbrains.kotlin.psi.KtNamedFunction
import org.jetbrains.kotlin.psi.psiUtil.containingClass
import org.jetbrains.kotlin.psi.psiUtil.getChildrenOfType
import org.jetbrains.kotlin.utils.addToStdlib.firstIsInstanceOrNull

object RpcFunctionReferenceChecker {
    private val rpcFunctionNames = listOf(
        "rpc",
        "rpcId",
        "rpcUnreliable",
        "rpcUnreliableId",
    )

    private val targetFunctionNotRegisteredQuickFix by lazy { TargetFunctionNotRegisteredQuickFix() }
    private val targetFunctionHasNoRpcAnnotationQuickFix by lazy { TargetFunctionHasNoRpcAnnotationQuickFix() }
    private val targetFunctionsRpcAnnotationHasRpcModeDisabled by lazy { TargetFunctionsRpcAnnotationHasRpcModeDisabled() }

    fun checkRpcTargetFunction(element: KtCallableReferenceExpression, holder: AnnotationHolder) {
        val relevantParent = element.parent.parent.parent
        val callReference = relevantParent.children.firstIsInstanceOrNull<KtNameReferenceExpression>()
        if (
            relevantParent is KtCallExpression &&
            rpcFunctionNames.contains(callReference?.text) &&
            (callReference?.resolve() as? KtNamedFunction)?.containingClass()?.fqName?.asString() == "godot.Node"
        ) {
            val targetFunction = element
                .callableReference
                .resolve() as? KtNamedFunction

            val registerFunctionAnnotation = targetFunction?.findAnnotation(FqName(REGISTER_FUNCTION_ANNOTATION))
            val rpcAnnotation = targetFunction?.findAnnotation(FqName(RPC_ANNOTATION))

            when {
                targetFunction != null && registerFunctionAnnotation == null -> {
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.rpc.calledFunctionNotRegistered"),
                        element,
                        targetFunctionNotRegisteredQuickFix
                    )
                }
                targetFunction != null && rpcAnnotation == null -> {
                    holder.registerProblem(
                        GodotPluginBundle.message("problem.rpc.calledFunctionHasNoRpcAnnotation"),
                        element,
                        targetFunctionHasNoRpcAnnotationQuickFix
                    )
                }
                else -> {
                    val rpcModeValueArgument = rpcAnnotation
                        ?.valueArgumentList
                        ?.arguments
                        ?.firstOrNull { it.isNamed() && it.getArgumentName()?.text == "rpcMode" } // named; so position is not relevant
                        ?: rpcAnnotation
                            ?.valueArgumentList
                            ?.arguments
                            ?.getOrNull(0) // not named; so getting by argument position

                    if (
                        rpcModeValueArgument
                            ?.getArgumentExpression()
                            ?.getChildrenOfType<KtNameReferenceExpression>()
                            ?.lastOrNull()
                            ?.resolve()
                            ?.getKotlinFqName()
                            ?.asString() == "godot.annotation.RpcMode.DISABLED"
                    ) {
                        holder.registerProblem(
                            GodotPluginBundle.message("problem.rpc.calledFunctionNotAccessible"),
                            element,
                            targetFunctionsRpcAnnotationHasRpcModeDisabled
                        )
                    }
                }
            }
        }
    }
}
