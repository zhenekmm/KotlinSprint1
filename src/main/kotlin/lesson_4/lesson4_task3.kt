package org.example.lesson_4

fun main() {
    val weatherTodaySunny = true
    val awning = true
    val airHumidity = 20
    val currentSeason = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${(weatherTodaySunny == true) && (awning == true) && (airHumidity == 20) && (currentSeason != "winter")}")
}