package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val inputSum = 70000
    val interestRate = 16.7 / 100
    val yearCount = 20

    val result = inputSum * (1 + interestRate).pow(yearCount)
    println(String.format("%.3f", result))
}