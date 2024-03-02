package io.hyubuki.app.many_to_many

import org.springframework.data.jpa.repository.JpaRepository

interface GirlsAndBoysRepository : JpaRepository<GirlsAndBoys, Long> {
}