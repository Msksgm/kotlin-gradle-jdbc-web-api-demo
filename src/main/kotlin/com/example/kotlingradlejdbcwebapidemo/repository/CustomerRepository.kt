package com.example.kotlingradlejdbcwebapidemo.repository

import com.example.kotlingradlejdbcwebapidemo.model.Customer

interface CustomerRepository {
    fun add(firstName: String, lastName: String)
    fun find(): List<Customer>
    fun update(id: Int, firstName: String, lastName: String)
    fun delete(id: Int)
}
