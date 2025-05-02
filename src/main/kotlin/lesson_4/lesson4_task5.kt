package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_COUNT_BOXES = 50
const val IS_DAMAGE = false
const val IS_WEATHER_FAVORABLE = true

fun main() {
    val presenceHullDamage = readln().toBoolean()
    val currentCrew = readln().toInt()
    val countBoxes = readln().toInt()
    val favorableWeather = readln().toBoolean()

    val canSail = (presenceHullDamage == IS_DAMAGE && currentCrew in MIN_CREW..MAX_CREW &&
            countBoxes > MIN_COUNT_BOXES) || (presenceHullDamage != IS_DAMAGE && currentCrew == MAX_CREW &&
            favorableWeather == IS_WEATHER_FAVORABLE && countBoxes >= MIN_COUNT_BOXES)

    println("Корабль может отправиться в плавание? $canSail")
}