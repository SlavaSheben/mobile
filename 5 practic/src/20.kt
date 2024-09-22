fun main() {
    print("Введите начало диапазона: ")
    val start = readLine()!!.toInt()

    print("Введите конец диапазона: ")
    val end = readLine()!!.toInt()

    println("Простые числа в диапазоне от $start до $end:")

    for (number in start..end) {
        if (isPrime1(number)) {
            print("$number ")
        }
    }
}

fun isPrime1(number: Int): Boolean {
    if (number <= 1) return false
    for (i in 2 until Math.sqrt(number.toDouble()).toInt() + 1) {
        if (number % i == 0) return false
    }
    return true
}

