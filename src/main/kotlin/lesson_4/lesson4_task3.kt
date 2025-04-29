package org.example.lesson_4

const val WEATHER_TODAY_SUNNY = true
const val AWNING = true
const val AIR_HUMIDITY = 20
const val CURRENT_SEASON = "winter"

fun main() {
    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(WEATHER_TODAY_SUNNY == true) && (AWNING == true) && (AIR_HUMIDITY == 20) && (CURRENT_SEASON != "winter")}")
}