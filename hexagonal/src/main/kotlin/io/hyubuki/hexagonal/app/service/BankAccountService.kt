package io.hyubuki.hexagonal.app.service

import io.hyubuki.hexagonal.app.BankAccount
import io.hyubuki.hexagonal.app.port.`in`.DepositUseCase
import io.hyubuki.hexagonal.app.port.`in`.WithdrawUseCase
import io.hyubuki.hexagonal.app.port.out.LoadAccountPort
import io.hyubuki.hexagonal.app.port.out.SaveAccountPort
import org.springframework.beans.factory.annotation.Autowired
import java.math.BigDecimal


class BankAccountService : DepositUseCase, WithdrawUseCase {

    @Autowired
    private lateinit var loadAccountPort: LoadAccountPort

    @Autowired
    private lateinit var saveAccountPort: SaveAccountPort
    override fun deposit(id: Long?, amount: BigDecimal?) {
        val account: BankAccount = loadAccountPort.load(id)
        account.deposit(amount)
        saveAccountPort.save(account)
    }

    override fun withdraw(id: Long?, amount: BigDecimal?): Boolean {
        val account: BankAccount = loadAccountPort.load(id)
        val hasWithdrawn = account.withdraw(amount)
        if (hasWithdrawn) {
            saveAccountPort.save(account)
        }
        return hasWithdrawn
    }
}

