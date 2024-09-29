import kotlin.random.Random
fun main(){
    val ran = Array(10){ Random.nextInt(100) }
    println(ran.contentToString())
    for (ran in ran){
        if (ran%3==0){
            print("$ran\t")
        }
    }
}