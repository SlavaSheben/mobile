import kotlin.random.Random

fun generatePassword(dlina: Int): String {
    val sym = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+"
    val password = StringBuilder()
    for (i in 0 until dlina) {
        password.append(sym[Random.nextInt(sym.length)])
    }
    return password.toString()
}

fun main() {
    print("Введите желаемую длину пароля: ")
    val long = readLine()!!.toInt()
    val password = generatePassword(long)
    println("Сгенерированный пароль: $password")
}
