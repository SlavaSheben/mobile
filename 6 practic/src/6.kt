import kotlin.random.Random
fun main() {
    val random = Array(10) { Random.nextInt(0, 100) }
    for (i in random) {
        print("$i,\t")
    }
    println("\nЧетные")
    for (i in random) {
        if (i % 2 == 0) {
            print("$i,\t")
        }
    }
    println("\nНечетные")
    for (i in random) {
        if (i % 2 != 0) {
            print("$i,\t")
        }
    }
}