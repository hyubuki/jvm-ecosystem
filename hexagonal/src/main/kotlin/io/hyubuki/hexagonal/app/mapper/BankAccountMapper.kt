package io.hyubuki.hexagonal.app.mapper

import io.hyubuki.hexagonal.app.BankAccount
import io.hyubuki.hexagonal.app.entity.BankAccountEntity
import org.springframework.stereotype.Component


@Component
class BankAccountMapper {
    fun toDomain(entity: BankAccountEntity): BankAccount {

        return BankAccount(entity.id!!, entity.balance)
    }

    fun toEntity(domain: BankAccount): BankAccountEntity {

        return BankAccountEntity(domain.balance)
    }
}