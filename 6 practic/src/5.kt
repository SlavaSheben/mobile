fun filter(input:Array<String>):List<String>{
    return input.filter{it.all{char -> char.isLetter()}}
}
fun main(){
    val mass = arrayOf("2", "f" ,"54" ,"3" ,"d" ,"s")
    for (i in mass){
        print("$i, ")
    }
    println("")
    val words = filter(mass)
    println("$words, ")
}