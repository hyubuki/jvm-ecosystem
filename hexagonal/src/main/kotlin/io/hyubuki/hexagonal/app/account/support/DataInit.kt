package io.hyubuki.hexagonal.app.account.support

import io.hyubuki.hexagonal.app.account.entity.BankAccountEntity
import io.hyubuki.hexagonal.app.account.adapter.out.BankAccountSpringDataRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class DataInit(private val repository: BankAccountSpringDataRepository) {

    @PostConstruct
    fun initData() {
        repository.save(BankAccountEntity())
    }
}