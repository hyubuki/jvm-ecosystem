package io.hyubuki.hexagonal.app.support

import io.hyubuki.hexagonal.app.BankAccount
import io.hyubuki.hexagonal.app.entity.BankAccountEntity
import io.hyubuki.hexagonal.app.repository.BankAccountSpringDataRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class DataInit(private val repository: BankAccountSpringDataRepository) {

    @PostConstruct
    fun initData() {
        repository.save(BankAccountEntity())
    }
}