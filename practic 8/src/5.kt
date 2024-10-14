
fun isWorthIt(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

fun main() {
    val reader = java.util.Scanner(System.`in`)
    print("Введите значение prob: ")
    val prob = reader.nextDouble()
    print("Введите prize: ")
    val prize = reader.nextDouble()
    print("Введите pay: ")
    val pay = reader.nextDouble()

    val result = isWorthIt(prob, prize, pay)
    if (result) {
        println("\n$result")
    } else {
        println("\n$result")
    }
}
