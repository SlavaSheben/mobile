fun main() {
    var numbor: Int
        print("Введите двузначное число: ")
        numbor = readln().toInt()
     if ((numbor > 9) && (numbor < 100))
    println("Ваше число - $numbor")
    println("a)${numbor / 10}\t\tб)${numbor % 10}")
    println("в)${numbor / 10 + numbor % 10}\tг)${(numbor / 10) * (numbor % 10)}")
}