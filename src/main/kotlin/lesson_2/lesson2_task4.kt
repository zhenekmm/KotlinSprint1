package org.example.lesson_2

fun main() {
    val countCrystallineOre = 7
    val ironOre = 11
    val gainPercentage = 0.2

    val crystallineBonus = (countCrystallineOre * gainPercentage).toInt()
    val ironBonus = (ironOre * gainPercentage).toInt()

    println("Количество бонусной кристаллической руды - $crystallineBonus")
    println("Количество бонусной железной руды - $ironBonus")
}