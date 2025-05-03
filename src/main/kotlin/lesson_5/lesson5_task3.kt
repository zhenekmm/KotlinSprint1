package org.example.lesson_5

fun main() {
    val firstNumber = (0..42).random()
    val secondNumber = (0..42).random()

    print("Введите первое число: ")
    val inputA = readln().toInt()
    print("Введите второе число: ")
    val inputB = readln().toInt()


    if ((inputA == firstNumber && inputB == secondNumber) || (inputB == firstNumber && inputA == secondNumber))
        println("Поздравляем! Вы выиграли главный приз!")
    else if(inputA == firstNumber || inputA == secondNumber || inputB == secondNumber || inputB == firstNumber)
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Правильные числа для победы: $firstNumber и $secondNumber")
}