package com.example
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class TransactionalAnnotationTest {

    @Inject
    var personService: PersonService? = null

    @Test
    fun testItWorks() {
        val person = Person(1, "first-name")
        val result = personService!!.save(person).blockingGet()
        Assertions.assertEquals("first-name", result.name)
    }
}
