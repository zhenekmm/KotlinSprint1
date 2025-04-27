package org.example.lesson_2

fun main() {
    val countWorker = 50
    val salaryWorker = 30000
    val countIntern = 30
    val salaryIntern = 20000

    val expensesSalaryWorker = countWorker * salaryWorker
    val generalExpenses = expensesSalaryWorker + (countIntern * salaryIntern)
    val averageSalary = generalExpenses / (countIntern + countWorker)

    println(expensesSalaryWorker)
    println(generalExpenses)
    println(averageSalary)
}