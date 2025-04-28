package org.example.lesson_3

fun main() {
    val inputMove = "D2-D4;0".split("-", ";")

    val startPoint = inputMove[0]
    val endPoint = inputMove[1]
    val numberMove = inputMove[2]

    println(startPoint)
    println(endPoint)
    println(numberMove)
}