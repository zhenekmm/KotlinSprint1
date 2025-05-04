package org.example.lesson_5

fun main() {
    val userName = "Zaphod"
    val password = "PanGalactic"

    print("Введите имя пользователя: ")
    val inputUserName = readln()

    if (inputUserName == userName) {
        print("Введите пароль: ")
        val inputPassword = readln()
        if (inputPassword == password) {
            println("Пользователь \"$userName\", вам разрешено входить на " +
                    "борт корабля \"Heart of Gold\". Добро пожаловать!")
        }
    } else {
        println("Такого пользователя не найдено. Хотите зарегистрироваться?")
    }
}