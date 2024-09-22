fun main() {
    println("Введите числовое значение баллов (от 0 до 100):")
    val ball = readLine()!!.toDouble()
    val ocenka = getOcenka(ball)
    println("Оценка: $ocenka")
}
fun getOcenka(ball:Double):String {
    return when {
        ball < 0 || ball > 100 -> "Вы ввели значение за пределами числового значения"
        ball >= 90 -> "A"
        ball >= 80 -> "B"
        ball >= 60 -> "C"
        ball >= 40 -> "D"
        ball >= 30 -> "E"
        else -> "F"
    }
}