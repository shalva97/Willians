package com.github.shalva97

fun main() {
   val f = 5.factorial()
    println(f/5)
}

fun Number.factorial(): Long {
    return (1..this.toLong()).fold(1) { i: Long, l: Long ->
        return l * i
    }
}