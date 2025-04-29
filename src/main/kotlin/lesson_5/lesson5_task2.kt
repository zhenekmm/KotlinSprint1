package org.example.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = 2025
    val userYear = readln().toInt()

    if(currentYear - userYear >= AGE_OF_MAJORITY){
        println("Показать экран со скрытым контентом")
    }
    else{
        println("Доступ запрещён")
    }
}