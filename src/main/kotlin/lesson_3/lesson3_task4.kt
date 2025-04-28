package org.example.lesson_3

fun main() {
    var startPoint = "E2"
    var endPoint = "E4"
    var numberMove = 1

    println("""Шаг №$numberMove
        |$startPoint
        |$endPoint
    """.trimMargin())

    startPoint = "D2"
    endPoint = "D3"
    numberMove++

    println("""Шаг №$numberMove
        |$startPoint
        |$endPoint
    """.trimMargin())
}