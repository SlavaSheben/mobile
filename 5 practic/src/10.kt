fun main() {
    println("Введите число:")
    val input = readLine()!!
    val sum = input.map { it.toString().toInt() }.sum()
    println("Сумма цифр = $sum")
}
