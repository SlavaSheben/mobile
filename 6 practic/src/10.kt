import kotlin.random.Random
fun main(){
    val random = Array(20) { Random.nextInt(0,100) }
    println("Массв: ${random.contentToString()}")
    var sum = 0
    for(random in random){
        if(random % 2 == 0){
            sum += random
        }
    }
    println("Сумма четных чисел массива:$sum")
}