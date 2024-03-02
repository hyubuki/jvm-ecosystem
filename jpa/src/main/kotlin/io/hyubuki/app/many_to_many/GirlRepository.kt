package io.hyubuki.app.many_to_many

import org.springframework.data.jpa.repository.JpaRepository

interface GirlRepository : JpaRepository<Girl, Long> {
}