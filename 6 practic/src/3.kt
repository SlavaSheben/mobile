import kotlin.math.pow
import kotlin.math.max
import kotlin.math.min
import kotlin.random.Random
fun main(){
    val random = Array(10){Random.nextInt(0,100)}
    for (i in random){
        print("$i,\t")
    }
    val max = random.max()
    val min = random.min()
    println("\n$max - max\n$min - min")
}