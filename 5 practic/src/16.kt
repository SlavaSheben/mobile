fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()
    val sumOfSquares = (1..n).sumOf { it * it }
    println("Сумма квадратов от 1 до $n = $sumOfSquares")
}