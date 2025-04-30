package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_COUNT_BOXES = 50
const val isDamage = false
const val isFavorableWeather = true

fun main() {
    val presenceHullDamage = readln().toBoolean()
    val currentCrew = readln().toInt()
    val countBoxes = readln().toInt()
    val favorableWeather = readln().toBoolean()

    val canSail = (presenceHullDamage == isDamage && currentCrew in MIN_CREW..MAX_CREW && countBoxes > MIN_COUNT_BOXES && (favorableWeather == isFavorableWeather || favorableWeather != isFavorableWeather)) ||
            (presenceHullDamage != isDamage && currentCrew == MAX_CREW && favorableWeather == isFavorableWeather && countBoxes >= MIN_COUNT_BOXES)

    println("Корабль может отправиться в плавание? $canSail")
}