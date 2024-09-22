fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()
    val sum = (1..n).sumOf { 1.0 / it }
    println("Сумма ряда = $sum")
}