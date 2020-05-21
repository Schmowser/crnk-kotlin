package com.schmowser.crnkkotlin

import com.fasterxml.jackson.annotation.JsonProperty
import io.crnk.core.resource.annotations.JsonApiId
import io.crnk.core.resource.annotations.JsonApiResource

@JsonApiResource(type = "cards")
class Card(
        @JsonApiId var id: Long?,
        @JsonProperty var value: String
) {
    constructor() : this(null, "")
}