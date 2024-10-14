fun findLongestWord(str: String): String {
    val words = str.split("\\s+".toRegex())
    var longword = words[0]
    for (word in words) {
        if (word.length > longword.length) {
            longword = word
        }
    }
    return longword
}

fun main() {
    println("Введите строку:")
    val str = readLine()!!
    val longword = findLongestWord(str)
    println("Самое длинное слово: $longword")
}
