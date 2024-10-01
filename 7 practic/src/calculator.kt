fun main() {
    println("Калькулятор")
    println("1. Сложение")
    println("2. Вычитание")
    println("3. Умножение")
    println("4. Деление")
    println("0. Выход")
    print("Введите номер операции: ")
    val operation = readLine()?.toIntOrNull()
    if (operation != null && operation in 1..4) {
        print("Введите первое число: ")
        val num1 = readLine()?.toDoubleOrNull()
        print("Введите второе число: ")
        val num2 = readLine()?.toDoubleOrNull()
        if (num1 != null && num2 != null) {
            when (operation) {
                1 -> println("$num1 + $num2 = ${num1 + num2}")
                2 -> println("$num1 - $num2 = ${num1 - num2}")
                3 -> println("$num1 * $num2 = ${num1 * num2}")
                4 -> {
                    if (num2 != 0.0) {
                        println("$num1 / $num2 = ${num1 / num2}")
                    } else {
                        println("Деление на ноль невозможно!")
                    }
                }
            }
        } else {
            println("Некорректный ввод чисел!")
        }
    } else if (operation == 0) {
        println("Выход из программы.")
    } else {
        println("Некорректный ввод операции!")
    }
}
