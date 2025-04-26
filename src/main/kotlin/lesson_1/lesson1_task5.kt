package org.example.lesson_1

fun main() {
    val countSeconds = 6480
    val convertTime = 60

    val countMinutes = countSeconds / convertTime
    val secondsRemainder = countSeconds % convertTime
    val countHours = countMinutes / convertTime
    val minutesRemainder = countMinutes % convertTime

    println(String.format("0%d:%02d:%02d", countHours, minutesRemainder, secondsRemainder))
}