import kotlin.random.Random

fun main() {
    val randomNumber = Random.nextInt(1, 101)
    var guess: Int?

    println("Угадайте число от 1 до 100:")
    do {
        guess = readLine()!!.toInt()
        when {
            guess < randomNumber -> println("Слишком мало!")
            guess > randomNumber -> println("Слишком много!")
            else -> println("Поздравляем! Вы угадали число!")
        }
    } while (guess != randomNumber)
}