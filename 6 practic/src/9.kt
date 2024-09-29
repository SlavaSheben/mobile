import kotlin.random.Random
fun main(){
    val random = Array(20) { Random.nextInt(0,100) }
    println("Массв: ${random.contentToString()}")
    val copy = random.copyOf()
    println("Копия: ${copy.contentToString()}")
}