import kotlin.random.Random

fun main() {
    repeat(10) {
        println(Random.nextInt(1, 101))
    }
}