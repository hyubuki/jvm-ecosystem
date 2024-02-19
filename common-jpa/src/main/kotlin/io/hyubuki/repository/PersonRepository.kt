package io.hyubuki.repository

import io.hyubuki.entity.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<PersonEntity, Long> {
}