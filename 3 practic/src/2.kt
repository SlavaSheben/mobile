fun main() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toDouble()

    print("Введите второе число: ")
    val num2 = readLine()!!.toDouble()

    print("Введите третье число: ")
    val num3 = readLine()!!.toDouble()

    val middleNumber = findMiddleNumber(num1, num2, num3)

    println("Число, находящееся между наименьшим и наибольшим: $middleNumber")
}

fun findMiddleNumber(a: Double, b: Double, c: Double): Double {
    if (a <= b && b <= c || c <= b && b <= a) {
        return b
    } else if (b <= a && a <= c || c <= a && a <= b) {
        return a
    } else {
        return c
    }
}