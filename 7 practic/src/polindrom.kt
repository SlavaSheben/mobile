fun main() {
    println("Введите слово (на английском):")
    var word = readLine() ?: return
    word = word.replace("""\W""".toRegex(), "")
    var word2 = word.lowercase().replace("""\W""".toRegex(), "")
    word2 == word2.reversed()
    if (word.lowercase() == word2.lowercase()) {
        println("$word является палиндромом.")
    } else {
        println("$word не является палиндромом.")
    }
}
