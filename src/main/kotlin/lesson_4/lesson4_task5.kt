package org.example.lesson_4

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_COUNT_BOXES = 50

fun main() {
    val presenceHullDamage = readln().toBoolean()
    val currentCrew = readln().toInt()
    val countBoxes = readln().toInt()
    val favorableWeather = readln().toBoolean()

    val canSail = (!presenceHullDamage && currentCrew >= MIN_CREW && currentCrew <= MAX_CREW && countBoxes > MIN_COUNT_BOXES) ||
            (presenceHullDamage && currentCrew == MAX_CREW && favorableWeather && countBoxes >= MIN_COUNT_BOXES)

    println("Корабль может отправиться в плавание? $canSail")
}