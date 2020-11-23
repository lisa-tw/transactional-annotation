package com.example

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.reactive.RxJavaCrudRepository

@JdbcRepository(dialect = Dialect.H2)
interface PersonRepository : RxJavaCrudRepository<Person, Long>
