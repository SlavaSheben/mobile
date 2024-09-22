fun main(){
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    if (b > (a+c)){
        println("Error")
    }
    else if (a > (b+c)){
        println("Error")
    }
    else if (c > (a+b)){
        println("Error")
    }
    else {
        println("Good")
    }
}