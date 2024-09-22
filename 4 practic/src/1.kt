fun main() {
    println("Введите номер любого дня недели")
    var День_недели = readln()
    when (День_недели) {
        1.toString() -> println("Понедельник")
        2.toString() -> println("Вторник")
        3.toString() -> println("Среда")
        4.toString() -> println("Четверг")
        5.toString() -> println("Пятница")
        6.toString() -> println("Суббота")
        7.toString() -> println("Воскресенье")
        else -> println("Неправильный день недели")
    }
}