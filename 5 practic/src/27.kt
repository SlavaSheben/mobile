fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        println((1..i).joinToString(" "))
    }
}