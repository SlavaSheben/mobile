
import kotlin.random.Random
fun main(){
    val random = Array(10){Random.nextInt(0,100)}
    for (i in random){
        print("$i,\t")
    }
    random.sort()
    println("\n")
    for(i in random){
        print("$i,\t")
    }
}