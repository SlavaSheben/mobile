fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()
    val evenSum = (1..n).filter { it % 2 == 0 }.sum()
    val oddSum = (1..n).filter { it % 2 != 0 }.sum()
    println("Сумма четных чисел = $evenSum, нечётных чисел = $oddSum")
}