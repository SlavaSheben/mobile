fun fizzBuzz(n: Int): List<Any> {
    return (1..n).map {
        when {
            it % 3 == 0 && it % 5 == 0 -> "ВизллБизлл"
            it % 3 == 0 -> "Физллл"
            it % 5 == 0 -> "Бизлллл"
            else -> it
        }
    }
}

fun main() {
    println(fizzBuzz(5))  // [1, 2, Физллл, 4, Бизлллл]
    println(fizzBuzz(16)) // [1, 2, Физллл, 4, Бизлллл, Физллл, 7, 8, Физллл, Бизлллл, 11, Физллл, 13, 14, ВизллБизлл, 16]
    println("Введите свое число")
    val a = readLine()!!.toInt()
    println(fizzBuzz(a))
}
