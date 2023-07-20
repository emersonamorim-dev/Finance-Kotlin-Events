package com.bank.finance.service

import kotlinx.coroutines.delay
import org.springframework.stereotype.Service

@Service
class BankingService {

    suspend fun deposit(amount: Double) {
        delay(1000) 
        println("Depósito de $amount realizado.")
    }

    suspend fun withdraw(amount: Double) {
        delay(1000) 
        println("Saque de $amount realizado.")
    }

    suspend fun transfer(fromAccount: String, toAccount: String, amount: Double) {
        delay(1000) 
        println("Transferência de $amount de $fromAccount para $toAccount realizada.")
    }
}
