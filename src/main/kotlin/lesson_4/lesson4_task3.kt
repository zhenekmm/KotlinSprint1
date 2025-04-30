package org.example.lesson_4

const val isSunny = true
const val isAwningOpen = true
const val AIR_HUMIDITY = 20
const val SEASON = "summer"

fun main() {
    val isSunnyCurrent = true
    val isAwningOpenCurrent = true
    val airHumidityCurrent = 20
    val seasonCurrent = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${(isSunny == isSunnyCurrent) && (isAwningOpen == isAwningOpenCurrent) 
                    && (AIR_HUMIDITY == airHumidityCurrent) && (SEASON == seasonCurrent)}")
}