package com.example.kotlingradlejdbcwebapidemo.service

import com.example.kotlingradlejdbcwebapidemo.model.Customer
import com.example.kotlingradlejdbcwebapidemo.repository.CustomerRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CustomerServiceImpl(val insertCommandRepository: CustomerRepository) : CustomerService {
    @Transactional
    override fun insertCustomer(firstName: String, lastName: String) {
        insertCommandRepository.add(firstName, lastName)
        return
    }

    @Transactional
    override fun selectCustomer(): List<Customer> {
        return insertCommandRepository.find()
    }
}
