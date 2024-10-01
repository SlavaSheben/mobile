fun main() {
    print("Введите список чисел через запятую: ")
    val a = readLine() ?: return
    val min = a.split(",").mapNotNull { it.trim().toIntOrNull() }
    if (min.isEmpty()) {
        println("Есть ошибка")
    } else {
        println("Самое маленькое число из списка: ${min.minOrNull()}")
    }
}