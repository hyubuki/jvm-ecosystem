package io.hyubuki.hexagonal.app.account.adapter.out

import io.hyubuki.hexagonal.app.account.entity.BankAccountEntity

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

interface BankAccountSpringDataRepository : JpaRepository<BankAccountEntity, Long>