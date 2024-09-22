import kotlin.math.max


fun main() {
    print("Enter first number : ")
    var a = readLine()!!.toDouble()
    print("Enter second number : ")
    var b = readLine()!!.toDouble()
    print("Enter third number : ")
    var c = readLine()!!.toDouble()
    val result = max(max(a, b), c)
    println("$result")
}