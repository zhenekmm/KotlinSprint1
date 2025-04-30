package org.example.lesson_5

fun main() {
    println("Для авторизации необходимо решить простой математический пример – сложить два числа")

    val firstNumber = (1..9).random()
    val secondNumber = (1..9).random()

    print("Введите результат сложения $firstNumber и $secondNumber: ")
    val result = readln().toInt()

    if (result == firstNumber + secondNumber) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}