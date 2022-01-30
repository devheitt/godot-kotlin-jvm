package godot.codegen.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty

data class GlobalEnum @JsonCreator constructor(
    @JsonProperty("name") val name : String,
    @JsonProperty("values") val values : List<EnumValue>
)
