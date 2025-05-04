package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val a = Random.nextInt(0, 43)
    val b = Random.nextInt(0, 43)
    val c = Random.nextInt(0, 43)
    val secretNumbers = listOf(a, b, c)

    print("Введите первое число: ")
    val inputA = readln().toInt()
    print("Введите второе число: ")
    val inputB = readln().toInt()
    print("Введите третье число: ")
    val inputC = readln().toInt()
    val inputNumbers = listOf(inputA, inputB, inputC)

    val result = secretNumbers.intersect(inputNumbers).size
    when(result){
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        1 -> println("Вы угадали одно число и получаете утешительный приз")
        else -> println("Вы не угадали ни одного числа")
    }

    println(secretNumbers)
}