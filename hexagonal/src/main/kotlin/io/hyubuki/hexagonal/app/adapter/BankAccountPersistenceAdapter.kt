package io.hyubuki.hexagonal.app.adapter

import io.hyubuki.hexagonal.app.BankAccount
import io.hyubuki.hexagonal.app.entity.BankAccountEntity
import io.hyubuki.hexagonal.app.mapper.BankAccountMapper
import io.hyubuki.hexagonal.app.port.out.LoadAccountPort
import io.hyubuki.hexagonal.app.port.out.SaveAccountPort
import io.hyubuki.hexagonal.app.repository.BankAccountSpringDataRepository
import org.springframework.stereotype.Repository


@Repository
class BankAccountPersistenceAdapter(
    private val bankAccountMapper: BankAccountMapper,
    private val repository: BankAccountSpringDataRepository,
) : LoadAccountPort, SaveAccountPort {

    override fun load(id: Long): BankAccount {

        val entity = repository.findById(id).orElseThrow { NoSuchElementException() }

        return bankAccountMapper.toDomain(entity)
    }

    override fun save(bankAccount: BankAccount) {

        val entity: BankAccountEntity = bankAccountMapper.toEntity(bankAccount)

        repository.save(entity)
    }
}