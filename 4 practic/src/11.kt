fun main() {
    println("Введите вашу группу крови (A, B, AB, O):")
    val bloodType = readLine()?.toUpperCase()
    val compatibleBloodTypes = when (bloodType) {
        "A" -> "A, O"
        "B" -> "B, O"
        "AB" -> "A, B, AB, O"
        "O" -> "O"
        else -> "Вы ввели некорректную группу крови"
    }
    println("Совместимые группы крови для переливания: $compatibleBloodTypes")
}