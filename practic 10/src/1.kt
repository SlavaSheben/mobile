fun countdown(n: Int): List<Int> {
    return if (n > 0) (n downTo 1).toList()
    else emptyList()
}

fun main() {
    // Тесты
    println(countdown(5))  // Вывод: [5, 4, 3, 2, 1]
    println(countdown(1))  // Вывод: [1]
    println(countdown(0))  // Вывод: []
    println("Введите значение")
    val a = readLine()!!.toInt()
    println(countdown(a))
}