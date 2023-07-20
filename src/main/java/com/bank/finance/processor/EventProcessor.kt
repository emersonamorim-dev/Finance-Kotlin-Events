package com.bank.finance;

import kotlinx.coroutines.*
import com.bank.finance.eventChannel

suspend fun processItem(item: Int): Int {
    delay(1000) 
    return item * item 
}

suspend fun processEvents() = coroutineScope {
    for (event in eventChannel) {
        launch {
            val result = processItem(event)
            println("Resultado: $result")
        }
    }
}
