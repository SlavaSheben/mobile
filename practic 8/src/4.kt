fun check(prob: Double, prize: Double, pay: Double): Boolean {
    return prob * prize > pay
}

fun main() {
    println(check(0.1, 1000.0, 50.0))  // True
    println(check(0.05, 2000.0, 100.0)) // False
}