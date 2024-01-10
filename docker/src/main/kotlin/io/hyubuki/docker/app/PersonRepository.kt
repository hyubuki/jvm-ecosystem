package io.hyubuki.docker.app

import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository: JpaRepository<Person, Long> {
}