package com.example.kotlingradlejdbcwebapidemo.controller

import com.example.kotlingradlejdbcwebapidemo.model.Customer

data class CustomerResponse(
    val customers: List<Customer>
)
