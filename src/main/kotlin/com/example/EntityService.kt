package com.example

import io.reactivex.Single
import javax.inject.Singleton
import javax.transaction.Transactional

@Singleton
open class EntityService(private val entityRepository: EntityRepository) {

    @Transactional
    open fun save(entity: Person): Single<Person> {
        return entityRepository.save(entity)
    }
}


