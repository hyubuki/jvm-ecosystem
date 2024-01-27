package io.hyubuki.hexagonal.app.repository

import io.hyubuki.hexagonal.app.entity.BankAccountEntity

import org.springframework.data.jpa.repository.JpaRepository


interface BankAccountSpringDataRepository : JpaRepository<BankAccountEntity, Long>