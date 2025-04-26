package org.example.lesson_2

fun main() {
    val hourDeparture = 9
    val minuteDeparture = 39
    val travelTime = 457
    val convertTime = 60

    //общее количество минут с начала дня до прибытия
    val totalDepartureMinutes = hourDeparture * convertTime + minuteDeparture
    val totalArrivalMinutes = totalDepartureMinutes + travelTime

    val arrivalHour = totalArrivalMinutes / convertTime
    val arrivalMinute = totalArrivalMinutes % convertTime

    println(String.format("%02d:%02d", arrivalHour, arrivalMinute))
}