package io.hyubuki.app.repository

import io.hyubuki.app.entity.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<PersonEntity, Long> {
}