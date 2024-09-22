fun main() {
    println("Введите строку:")
    val input = readLine()!!
    println("Строка является палиндромом: ${input == input.reversed()}")
}