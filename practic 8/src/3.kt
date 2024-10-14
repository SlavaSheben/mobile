fun botat (spisok1: List<Int>, spisok2: List<Int>): List<Int> {
    return spisok1 + spisok2
}



fun main() {
    println("Введите первый список целых чисел через пробел:")
    val enter = readLine()
    val spisok1 = enter?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()

    println("Введите второй список целых чисел через пробел:")
    val Enter = readLine()
    val spisok2 = Enter?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: emptyList()

    val mergedSpisok = botat(spisok1, spisok2)
    println("Объединённый список: $mergedSpisok")
}