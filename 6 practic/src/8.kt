import kotlin.random.Random
fun main(){
    val numbers = Array(10){Random.nextInt(0,100)}
    println("Массив: ${numbers.contentToString()}")
    val target = readLine()!!.toInt()
    val index = numbers.indexOf(target)
    if (index != -1) {
        println("Индекс элемента $target: $index")
    } else {
        println("Элемент $target не найден в массиве.")
    }
}