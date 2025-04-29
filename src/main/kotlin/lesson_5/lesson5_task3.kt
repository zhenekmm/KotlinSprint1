package org.example.lesson_5

fun main() {
    val a = 19
    val b = 33

    print("Введите первое число: ")
    val inputA = readln().toInt()
    print("Введите второе число: ")
    val inputB = readln().toInt()


    if ((inputA == a && inputB == b) || (inputB == a && inputA == b)) println("Поздравляем! Вы выиграли главный приз!")
    else if(inputA == a || inputA == b || inputB == b || inputB == a) println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Правильные числа для победы: $a и $b")
}