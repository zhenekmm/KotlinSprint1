package org.example.lesson_3

fun main() {
    val inputMove = "D2-D4;0".split(";")
    val numberMove = inputMove[1]
    val move = inputMove[0].split("-")
    val startPoint = move[0]
    val endPoint = move[1]


    println(startPoint)
    println(endPoint)
    println(numberMove)
}