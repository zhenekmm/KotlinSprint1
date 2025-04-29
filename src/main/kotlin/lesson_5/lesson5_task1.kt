package org.example.lesson_5

fun main() {
    println("Для авторизации необходимо решить простой математический пример – сложить два числа")
    print("Введите первое число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()
    print("Введите результат сложения $a и $b: ")
    val result = readln().toInt()

    if (result == a + b) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}