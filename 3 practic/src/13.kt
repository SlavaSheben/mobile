fun main() {
    print("Введите четырехзначное число: ")
    val number = readLine()!!.toInt()

    val thousandsDigit = number / 1000
    val hundredsDigit = (number % 1000) / 100
    val tensDigit = (number % 100) / 10
    val unitsDigit = number % 10

    // а) Равна ли сумма двух первых цифр сумме двух последних
    val sumFirstTwo = thousandsDigit + hundredsDigit
    val sumLastTwo = tensDigit + unitsDigit
    if (sumFirstTwo == sumLastTwo) {
        println("Сумма двух первых цифр равна сумме двух последних.")
    } else {
        println("Сумма двух первых цифр не равна сумме двух последних.")
    }

    // б) Кратна ли трем сумма его цифр
    val sumDigits = thousandsDigit + hundredsDigit + tensDigit + unitsDigit
    if (sumDigits % 3 == 0) {
        println("Сумма цифр кратна трем.")
    } else {
        println("Сумма цифр не кратна трем.")
    }

    // в) Кратна ли четырем произведение его цифр
    val productDigits = thousandsDigit * hundredsDigit * tensDigit * unitsDigit
    if (productDigits % 4 == 0) {
        println("Произведение цифр кратно четырем.")
    } else {
        println("Произведение цифр не кратно четырем.")
    }

    // г) Кратна ли произведение его цифр числу а
    print("Введите число а: ")
    val a = readLine()!!.toInt()
    if (productDigits % a == 0) {
        println("Произведение цифр кратно $a.")
    } else {
        println("Произведение цифр не кратно $a.")
    }
}