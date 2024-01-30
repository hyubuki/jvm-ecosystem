package io.hyubuki.springevent.app.pre

import org.springframework.data.jpa.repository.JpaRepository

interface PreDomainRepository: JpaRepository<PreDomainEntity, Long> {
}