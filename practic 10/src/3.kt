fun caesarCipher(text: String, shift: Int): String {
    val result = StringBuilder()

    for (char in text) {
        // Проверяем, является ли символ буквой
        if (char.isLetter()) {
            // Определяем, нужно ли сдвигать в пределах верхнего или нижнего регистра
            val base = if (char.isLowerCase()) 'a' else 'A'
            // Сдвигаем букву и добавляем ее к результату
            val shifted = ((char - base + shift) % 26 + base.toInt()).toChar()
            result.append(shifted)
        } else {
            // Если символ не буква, просто добавляем его в результат
            result.append(char)
        }
    }

    return result.toString()
}

fun main() {
    println("Enter text on english")
    val text = readLine().toString()
    val shift = 3

    val encrypted = caesarCipher(text, shift)
    println("Encrypted: $encrypted")

    // Расшифровка (обратный сдвиг)
    val decrypted = caesarCipher(encrypted, 26 - shift)
    println("Decrypted: $decrypted")
}
