package org.example.lesson_4

fun main() {
    val countTable = 13
    val reservationToday = 13
    val reservationTomorrow = 9

    println("Доступность столиков на сегодня: ${reservationToday < countTable}")
    println("Доступность столиков на завтра: ${reservationTomorrow < countTable}")
}