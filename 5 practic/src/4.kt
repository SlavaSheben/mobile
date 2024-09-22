fun factorial(n: Int): Int {
    return if (n <= 1) 1 else n * factorial(n - 1)
}

fun main() {
    println("Введите число для вычисления факториала:")
    val number = readLine()!!.toInt()
    println("Факториал $number = ${factorial(number)}")
}