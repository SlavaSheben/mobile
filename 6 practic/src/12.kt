import kotlin.random.Random
fun main(){
    val random = Array(10){ Random.nextInt(100)}
    println(random.contentToString())
    random.shuffle()
    println(random.contentToString())
}