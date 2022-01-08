/Library/Java/JavaVirtualMachines/graalvm-ce-java11-21.1.0/Contents/Home/bin/native-image \
-cp build/libs/godot-bootstrap.jar:build/libs/main.jar \
-H:+SharedLibrary \
-H:+ExitAfterRelocatableImageWrite \
-H:+UseCAPCache \
-H:CAPCacheDir=./ios-cap \
-H:Name=usercode \
-H:CompilerBackend=llvm \
-H:JNIConfigurationFiles=graal/godot-kotlin-graal-jni-config.json \
-H:IncludeResources=build/resources/main/META-INF/services/*.* \
-H:-SpawnIsolates \
-H:PageSize=16384 \
-Dsvm.targetName=iOS \
-Dsvm.targetArch=arm64 \
-Dsvm.platform=org.graalvm.nativeimage.Platform\$IOS_AARCH64 \
-H:TempDirectory=build/libs/ios/ \
--features=org.graalvm.home.HomeFinderFeature \
--no-fallback \
--no-server \
--verbose \
--native-image-info \
-Djdk.internal.lambda.eagerlyInitialize=false \
-H:+AddAllCharsets \
-H:+ReportExceptionStackTraces \
-H:-DeadlockWatchdogExitOnTimeout \
-H:DeadlockWatchdogInterval=0 \
-H:+RemoveSaturatedTypeFlows \
-H:EnableURLProtocols=http,https \
-H:+PrintAnalysisCallTree
#-H:ReflectionConfigurationFiles=reflectionconfig-arm64-ios.json
#-H:Log=registerResource:verbose \
#\
#-Djdk.internal.lambda.eagerlyInitialize=false \
#-H:-UseServiceLoaderFeature \
#\

#-H:ReflectionConfigurationFiles=/Users/pierre-thomasmeisels/IdeaProjects/gluon-samples/HelloGluon/target/gluonfx/arm64-ios/gvm/reflectionconfig-arm64-ios.json


#mv usercode.dylib build/libs/usercode.dylib

#-H:CLibraryPath=/Library/Java/JavaVirtualMachines/graalvm-ce-java16-21.1.0/Contents/Home/lib/svm/clibraries/ios-arm64
