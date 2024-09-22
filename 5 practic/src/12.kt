fun main() {
    println("Введите начальное число:")
    val start = readLine()!!.toInt()
    println("Введите шаг:")
    val step = readLine()!!.toInt()
    for (i in 0 until 10) {
        println(start + i * step)
    }
}