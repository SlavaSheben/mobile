import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    println("Введите год:")
    val year = readLine()!!.toInt()
    println("Введите месяц:")
    val month = readLine()!!.toInt()

    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    val daysInMonth = LocalDate.of(year, month, 1).lengthOfMonth()

    for (day in 1..daysInMonth) {
        val date = LocalDate.of(year, month, day)
        println(date.format(formatter))
    }
}