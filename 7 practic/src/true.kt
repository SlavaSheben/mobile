fun main() {
    println("Введите первое число: ")
    var first:Int = readln().toInt()
    println("Введите второе число: ")
    var second:Int = readln().toInt()

    var a:Boolean
    if (first == second) {
        a = true
    }
    else a = false
    println("\nЧисла равны: $a")
}