package io.hyubuki.hexagonal.app.port.out

import io.hyubuki.hexagonal.app.BankAccount


interface LoadAccountPort {
    fun load(id: Long?): BankAccount?
}