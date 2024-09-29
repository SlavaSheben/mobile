import kotlin.random.Random

fun main() {
    var massa = Array<Int>(10, { Random.nextInt(0, 100) })
    println(massa.contentToString())
    var x:Int = 0
    for (a in 0..massa.size/2 - 1){
        if (massa[a] == massa[(massa.size - 1) - a]) x++
    }
    if (x == massa.size/2) println("Массив является палиндромом")
    else println("Массив не палиндром")
}
