package com.example.kotlingradlejdbcwebapidemo.repository

import com.example.kotlingradlejdbcwebapidemo.model.Customer
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class CustomerRepositoryImpl(val jdbcTemplate: JdbcTemplate) : CustomerRepository {
    override fun add(firstName: String, lastName: String) {
        val sql = "INSERT INTO customer(first_name, last_name) VALUES (?, ?);"
        jdbcTemplate.update(sql, firstName, lastName)
        return
    }

    override fun find(): List<Customer> {
        val sql = "SELECT id, first_name, last_name FROM customer;"
        val mapper = CustomerRowMapper()
        return jdbcTemplate.queryForStream(sql, mapper).toList()
    }

    override fun update(id: Int, firstName: String, lastName: String) {
        val sql = """
            UPDATE
                customer
            SET
                first_name = ?
                , last_name = ?
            WHERE
                id = ?
        """.trimIndent()
        jdbcTemplate.update(sql, firstName, lastName, id)
        return
    }
}
