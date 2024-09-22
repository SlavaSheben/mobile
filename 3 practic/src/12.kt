fun main() {
    print("Введите двузначное число: ")
    val number = readLine()!!.toInt()

    val firstDigit = number / 10
    val secondDigit = number % 10

    // а) Какая из цифр больше
    if (firstDigit > secondDigit) {
        println("Первая цифра больше.")
    } else if (firstDigit < secondDigit) {
        println("Вторая цифра больше.")
    } else {
        println("Цифры равны.")
    }

    // б) Одинаковы ли цифры
    if (firstDigit == secondDigit) {
        println("Цифры одинаковы.")
    } else {
        println("Цифры разные.")
    }
}