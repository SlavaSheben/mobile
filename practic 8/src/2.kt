fun raznicaMinMax(chisla: List<Int>): Int? {
    if (chisla.isEmpty()) return null
    val max = chisla.maxOrNull() ?: return null
    val min = chisla.minOrNull() ?: return null
    return max - min
}

fun main() {
    println("Введите целые числа через пробел:")
    val enter = readLine()
    if (enter != null) {
        val chisla = enter.split(" ").mapNotNull { it.toIntOrNull() }

        val one = raznicaMinMax(chisla)

        if (one != null) {
            println("Разность между самым большим и самым маленьким числом: $one")
        } else {
            println("Не удалось вычислить разность, проверьте введенные вами данные.")
        }
    } else {
        println("Вы ввели список который не поддерживается / в неправильном формате.")
    }
}