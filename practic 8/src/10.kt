fun repetition(txt: String, n: Int): String {
    if (n <= 0) {
        return ""
    }
    return txt + repetition(txt, n - 1)
}

fun main() {
    println(repetition("dingo ", 3))  // "dingo dingo dingo "
    println(repetition("pustota", 0)) // ""
}




