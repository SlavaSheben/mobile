fun main() {
    val X:Boolean = false
    val Y:Boolean = false
    val Z:Boolean = true
    print("X = $X  Y = $Y  Z = $Z\n")
    println("a) ${(X or Y and !Z)}")
    println("г) ${X and !Y or Z}")
    println("б) ${!X and !Y}")
    println("д) ${(X and(!Y or Z))}")
    println("в) ${!(X and Z) or Y}")
    println("е) ${(X or (!(Y or Z)))}")
}