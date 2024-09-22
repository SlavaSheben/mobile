fun main() {
    println("Введите длины сторон треугольника (a, b, c)")
    print("a= ")
    val a = readLine()!!.toDouble()
    print("b= ")
    val b = readLine()!!.toDouble()
    print("c= ")
    val c = readLine()!!.toDouble()

    val Type = getType(a, b, c)
    println("Треугольник со сторонами:$a, $b, $c, является $Type")
}

fun getType(a:Double, b:Double, c:Double):String {
    if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
        return "Такого треугольника не существует"
    }
    return when {
        a == b && b == c -> "Равносторонним"
        a == b || a == c || b == c -> "Равнобедренным"
        else -> "Разносторонним"
    }
}