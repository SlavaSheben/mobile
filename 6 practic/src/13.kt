import kotlin.random.Random
fun main(){
    val random = Array(10){ Random.nextInt(1,100)}
    println(random.contentToString())
}