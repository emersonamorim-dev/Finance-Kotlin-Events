
package com.bank.finance;

import kotlinx.coroutines.*
import com.bank.finance.generateEvents
import com.bank.finance.processEvents

fun main() = runBlocking {
    val startTime = System.currentTimeMillis()

    // Lança duas coroutines, uma para gerar eventos e outra para processar
    val job1 = launch { generateEvents() }
    val job2 = launch { processEvents() }

    // Espera ambas as coroutines finalizar
    joinAll(job1, job2)

    val endTime = System.currentTimeMillis()
    println("Tempo total: ${endTime - startTime} ms")
}
