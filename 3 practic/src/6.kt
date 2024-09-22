fun main() {
    print("Введите год: ")
    val year = readLine()!!.toInt()

    if (isLeapYear(year)) {
        println("$year - високосный год.")
        println("Количество дней в году: 366")
    } else {
        println("$year - не високосный год.")
        println("Количество дней в году: 365")
    }
}

fun isLeapYear(year: Int): Boolean {
    return when {
        year % 4 != 0 -> false
        year % 100 == 0 -> year % 400 == 0
        else -> true
    }
}
