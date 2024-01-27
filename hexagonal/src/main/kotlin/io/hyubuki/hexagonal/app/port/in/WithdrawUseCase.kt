package io.hyubuki.hexagonal.app.port.`in`

import java.math.BigDecimal


interface WithdrawUseCase {
    fun withdraw(id: Long, amount: BigDecimal): Boolean
}