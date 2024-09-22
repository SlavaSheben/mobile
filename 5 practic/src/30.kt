fun main() {
    println("Введите целое число:")
    val number = readLine()!!.toInt()
    val binary = Integer.toBinaryString(number)
    println("двоякое явление: $binary")
}