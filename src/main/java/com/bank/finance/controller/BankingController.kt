package com.bank.finance.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import com.bank.finance.service.BankingService

@RestController
class BankingController(private val bankingService: BankingService) {

    @PostMapping("/deposit")
    suspend fun deposit(@RequestParam amount: Double) {
        bankingService.deposit(amount)
    }

    @PostMapping("/withdraw")
    suspend fun withdraw(@RequestParam amount: Double) {
        bankingService.withdraw(amount)
    }

    @PostMapping("/transfer")
    suspend fun transfer(@RequestParam fromAccount: String, @RequestParam toAccount: String, @RequestParam amount: Double) {
        bankingService.transfer(fromAccount, toAccount, amount)
    }
}

