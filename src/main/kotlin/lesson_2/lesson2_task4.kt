package org.example.lesson_2

fun main() {
    val countCrystallineOre = 7
    val ironOre = 11
    val gainPercentage = 20

    val crystallineBonus = (countCrystallineOre * gainPercentage / 100).toInt()
    val ironBonus = (ironOre * gainPercentage / 100).toInt()

    println("Количество бонусной кристаллической руды - $crystallineBonus")
    println("Количество бонусной железной руды - $ironBonus")
}