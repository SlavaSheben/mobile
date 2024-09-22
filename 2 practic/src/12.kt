fun main() {
    val A:Boolean = true
    val B:Boolean = false
    val C:Boolean = false
    print("A = $A  B = $B  C = $C\n")
    println("a) ${A or !(A and B) or C}   ")
    println("б) ${!A or A and (B or C)}   ")
    println("в) ${(A or B and !C) and C}    ")
}