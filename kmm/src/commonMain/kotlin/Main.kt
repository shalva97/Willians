package com.github.shalva97

import com.ionspin.kotlin.bignum.integer.BigInteger
import com.ionspin.kotlin.bignum.integer.toBigInteger

//fun main1() {
//    (1..20).mapNotNull {
//        if( primeNumber(it).takeIf { (it%1f) == 0f } != null) {
//            it
//        } else null
//    }.println()
//}

fun main() {
//    BigInteger.parseString("25040013928179957760000000000000").plus(3).println()
//    123.factorial().println()
    37299.toBigInteger().isPrimeNumber().println()
}

fun BigInteger.isPrimeNumber(): Boolean {
    val factorial = (this - 1).factorial()
    val results = (factorial + 1).divideAndRemainder(this)
    return results.second == BigInteger.ZERO
}

fun Any?.println() {
    kotlin.io.println(this)
}