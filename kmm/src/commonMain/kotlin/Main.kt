package com.github.shalva97

fun main() {
    (1..20).mapNotNull {
        if( primeNumber(it).takeIf { (it%1f) == 0f } != null) {
            it
        } else null
    }.println()
}

fun primeNumber(j: Int): Float {
    val factorial = (j - 1).factorial()
    return (factorial + 1) / j.toFloat()
}

fun Number.factorial(): Long {
    return (1..this.toLong()).fold(1) { i: Long, l: Long ->
        return@fold l * i
    }
}

fun Any?.println() {
    kotlin.io.println(this)
}