package org.example.lesson_4

fun main() {
    val presenceHullDamage = readln().toBoolean()
    val currentCrew = readln().toInt()
    val countBoxes = readln().toInt()
    val favorableWeather = readln().toBoolean()

    val canSail = (!presenceHullDamage && currentCrew >= 55 && currentCrew <= 70 && countBoxes > 50) ||
            (presenceHullDamage && currentCrew == 70 && favorableWeather && countBoxes >= 50)

    println("Корабль может отправиться в плавание? $canSail")
}