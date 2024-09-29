import kotlin.random.Random
fun main(){
    val random = Array(10){ Random.nextInt(100)}
    val other_random = Array(10){ Random.nextInt(100)}
    println(random.contentToString())
    println(other_random.contentToString())
    val intersection = random.toSet().intersect(other_random.toSet())
    println(intersection)
}