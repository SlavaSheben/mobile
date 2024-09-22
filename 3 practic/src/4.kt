
fun main() {
    val number1 = readLine()!!.toDouble()
    val number2 = readLine()!!.toDouble()
    if ((number1 % number2) == 0.toDouble()){
        println("Кратно")
    }
    else{
        println("не кратно")
    }
}