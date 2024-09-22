fun main() {
    print("Введите первое число: ")
    val num1 = readLine()!!.toDouble()

    print("Введите второе число: ")
    val num2 = readLine()!!.toDouble()

    if (num1 > num2) {
        println("$num1 больше, чем $num2")
        println("$num2 меньше, чем $num1")
    } else if (num1 < num2) {
        println("$num2 больше, чем $num1")
        println("$num1 меньше, чем $num2")
    } else {
        println("Числа равны")
    }
}