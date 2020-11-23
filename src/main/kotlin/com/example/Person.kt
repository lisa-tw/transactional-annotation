package com.example

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.MappedEntity
import javax.persistence.Id

@Introspected
@MappedEntity
open class Person(
    @Id
    val id: Long,
    val name: String)
