fun main() {
    print("Введите делитель a: ")
    val a = readLine()!!.toInt()

    print("Введите делимое b: ")
    val b = readLine()!!.toInt()

    if (isDivisor(a, b)) {
        println("$a является делителем $b")
    } else {
        println("$a не является делителем $b")
    }
}

fun isDivisor(a: Int, b: Int): Boolean {
    return b % a == 0
}