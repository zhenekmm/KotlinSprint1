package org.example.lesson_1

fun main() {
    val countSeconds = 6480

    val countMinutes = countSeconds / 60
    val secondsRemainder = countSeconds % 60
    val countHours = countMinutes / 60
    val minutesRemainder = countMinutes % 60

    println("0$countHours:$minutesRemainder:0$secondsRemainder")
}