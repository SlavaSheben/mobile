fun main() {
    println("Введите число:")
    val input = readLine()
    // Проверяем, есть ли значение
        // Переводим введенное значение в число
    val number = input?.toDoubleOrNull()
    if (number != null) {
        // Определеяем знак числа
        val sign = when {
            number > 0 -> "положительным"
            number < 0 -> "отрицательным"
            else -> "ноль"
        }
        println("Число $number является $sign.")
    } else {
        println("Вы ввели неправильно значение, нужно ввести число.")
    }
}