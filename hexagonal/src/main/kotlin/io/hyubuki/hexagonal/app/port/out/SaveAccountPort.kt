package io.hyubuki.hexagonal.app.port.out

import io.hyubuki.hexagonal.app.BankAccount


interface SaveAccountPort {
    fun save(bankAccount: BankAccount?)
}