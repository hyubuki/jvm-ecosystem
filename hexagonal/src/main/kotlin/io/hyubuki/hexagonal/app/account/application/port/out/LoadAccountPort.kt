package io.hyubuki.hexagonal.app.account.application.port.out

import io.hyubuki.hexagonal.app.account.domain.BankAccount


interface LoadAccountPort {
    fun load(id: Long): BankAccount
}