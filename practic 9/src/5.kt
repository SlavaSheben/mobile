fun main() {
    println("Введите число N:")
    val N = readLine()!!.toInt()

    print("Простые числа до $N: ")
    for (i in 2..N) {
        if (isPrime(i)) {
            print("$i ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) {
        return false
    }
    for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}
