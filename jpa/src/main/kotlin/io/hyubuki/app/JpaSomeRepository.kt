package io.hyubuki.app

import org.springframework.data.jpa.repository.JpaRepository

interface JpaSomeRepository: JpaRepository<JpaSomeEntity, Long> {
}
