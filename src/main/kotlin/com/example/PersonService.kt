package com.example

import io.reactivex.Single
import javax.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class PersonService(private val personRepository: PersonRepository) {

    @Transactional
    open fun save(person: Person): Single<Person> {
        return personRepository.save(person)
    }
}


