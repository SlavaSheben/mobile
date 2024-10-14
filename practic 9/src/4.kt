fun isAnagram(string1: String, string2: String): Boolean {
    if (string1.length != string2.length) {
        return false
    }
    val charCounts1 = mutableMapOf<Char, Int>()
    for (char in string1) {
        charCounts1[char] = (charCounts1[char] ?: 0) + 1
    }
    val charCounts2 = mutableMapOf<Char, Int>()
    for (char in string2) {
        charCounts2[char] = (charCounts2[char] ?: 0) + 1
    }
    return charCounts1 == charCounts2
}

fun main() {
    println("Введите первую строку: ")
    val stroka1 = readLine()!!.toString()
    println("Введите вторую строку: ")
    val stroka2 = readLine()!!.toString()
    println(isAnagram(stroka1, stroka2))
}
