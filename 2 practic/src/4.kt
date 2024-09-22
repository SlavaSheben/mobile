import kotlin.math.pow

fun main() {
    print("Введите число: ")
    var x = readln().toDouble()
    print("Введите степень, в которую будем возводить число: ")
    var y = readln().toInt()
    println("$x ^ $y = ${x.pow(y)}")
}