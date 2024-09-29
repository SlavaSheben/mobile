fun main() {
    val originalArray = intArrayOf(1, 2, 3, 4, 5)
    println("Массив: ${originalArray.contentToString()}")
    val reversedArray1 = originalArray.reversedArray()
    println("Обратный массив: ${reversedArray1.contentToString()}")
}