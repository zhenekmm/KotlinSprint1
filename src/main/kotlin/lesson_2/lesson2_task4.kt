package org.example.lesson_2

fun main() {
    val countCrystallineOre = 7
    val ironOre = 11
    val gainPercentage = 20
    val totalPercentage = 100

    val crystallineBonus = (countCrystallineOre * gainPercentage / totalPercentage).toInt()
    val ironBonus = (ironOre * gainPercentage / totalPercentage).toInt()

    println("Количество бонусной кристаллической руды - $crystallineBonus")
    println("Количество бонусной железной руды - $ironBonus")
}