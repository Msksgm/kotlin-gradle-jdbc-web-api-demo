package com.example.kotlingradlejdbcwebapidemo.controller

import com.fasterxml.jackson.annotation.JsonProperty

data class UpdateCustomerRequest(
    @JsonProperty("first_name") val firstName: String = "Eve-default",
    @JsonProperty("last_name") val lastName: String = "Sample4-default",
)
