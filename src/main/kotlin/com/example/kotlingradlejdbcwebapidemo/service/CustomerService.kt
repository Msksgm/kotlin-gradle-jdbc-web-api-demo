package com.example.kotlingradlejdbcwebapidemo.service

import com.example.kotlingradlejdbcwebapidemo.model.Customer

interface CustomerService {
    fun insertCustomer(firstName: String, lastName: String)
    fun selectCustomer(): List<Customer>
    fun updateCustomer(id: Int, firstName: String, lastName: String)
}
