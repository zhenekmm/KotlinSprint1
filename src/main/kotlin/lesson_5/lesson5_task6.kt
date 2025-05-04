package org.example.lesson_5

fun main() {
    println("Введите вес (в килограммах)")
    val weight = readln().toDouble()
    println("Введите рост (в сантиметрах)")
    val height = readln().toFloat() / 100

    val result = weight / (height * height)

    println("ИМТ: " + String.format("%.2f", result))
    if (result < 18.5) {
        println("Недостаточная масса тела")
    } else if (result >= 18.5 && result < 25) {
        println("Нормальная масса тела")
    } else if (result >= 25 && result < 30) {
        println("Избыточная масса тела")
    } else {
        println("Ожирение")
    }
}