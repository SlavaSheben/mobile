fun swapCase(stroka: String): String {
    val res = StringBuilder()
    for (char in stroka) {
        if (char.isUpperCase()) {
            res.append(char.toLowerCase())
        } else if (char.isLowerCase()) {
            res.append(char.toUpperCase())
        } else {
            res.append(char)
        }
    }
    return res.toString()
}

fun main() {
    println("Введите строку: ")
    val string = readLine()!!
    val swappedStr = swapCase(string)
    println("Измененная строка: $swappedStr")
}
