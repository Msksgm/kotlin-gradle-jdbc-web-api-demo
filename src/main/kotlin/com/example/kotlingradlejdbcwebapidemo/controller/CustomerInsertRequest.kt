package com.example.kotlingradlejdbcwebapidemo.controller

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerInsertRequest(
    @JsonProperty("first_name") val firstName: String = "Carol",
    @JsonProperty("last_name") val lastName: String = "Sample3",
)
