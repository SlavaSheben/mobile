fun main() {
    println("Введите время в формате 00:00 (часы:минуты):")
    val inputTime = readLine() ?: return
    val timeParts = inputTime.split(":")
    if (timeParts.size != 2 || !isValidTime(timeParts[0], timeParts[1])) {
        println("Вы ввели неправильный формат")
        return
    }
    val hours = timeParts[0].toInt()
    val timeOfDay = when {
        hours in 0..5 -> "Ночь"
        hours in 6..11 -> "Утро"
        hours in 12..17 -> "День"
        hours in 18..23 -> "Вечер"
        else -> "Вы ввели неправильный формат"
    }

    println("Это время суток: $timeOfDay")
}

fun isValidTime(hoursStr:String, minutesStr:String):Boolean {
    val hours = hoursStr.toIntOrNull()
    val minutes = minutesStr.toIntOrNull()
    return (hours != null && hours in 0..23) && (minutes != null && minutes in 0..59)
}