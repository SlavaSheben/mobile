fun generatePyramid(n: Int): List<String> {
    val result = mutableListOf<String>()
    for (i in 1..n) {
        val spaces = " ".repeat(n - i)
        val hashtags = "#".repeat(2 * i - 1)
        val line = "$spaces$hashtags$spaces"
        println(line)
        result.add(line)
    }
    return result
}

fun main() {
    generatePyramid(3)
    println("Введите высоту пирамиды")
    val a = readLine()!!.toInt()
    generatePyramid(a)
}
