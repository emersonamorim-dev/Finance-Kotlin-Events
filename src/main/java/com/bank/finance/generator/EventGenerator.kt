package com.bank.finance;

import kotlinx.coroutines.*
import com.bank.finance.eventChannel

suspend fun generateEvents() {
    for (i in 1..1000) {
        eventChannel.send(i)
    }
    eventChannel.close() 
}
