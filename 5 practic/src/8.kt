fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
    println("Введите два числа:")
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    println("НОД($a, $b) = ${gcd(a, b)}")
}
