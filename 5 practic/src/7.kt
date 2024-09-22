fun fibonacci(n: Int): List<Int> {
    val fibList = mutableListOf(0, 1)
    while (fibList.size < n) {
        fibList.add(fibList[fibList.size - 1] + fibList[fibList.size - 2])
    }
    return fibList.take(n)
}

fun main() {
    println("Введите число N:")
    val n = readLine()!!.toInt()
    println("Первые $n чисел Фибоначчи: ${fibonacci(n)}")
}