fun main() {
    println("Введите строку:")
    val inputString = readLine() // Считывает строку

    if (inputString != null) {
        val length = inputString.length // Определяет длину
        println("Длина введенной строки: $length")
    } else {
        println("Строка пуста.")
    }
}