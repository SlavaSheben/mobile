fun main() {
    var numbor: Int
    print("Введите трехзначное число: ")
    numbor = readln().toInt()
    if ((numbor > 99) && (numbor < 1000))
        println("Ваше число - $numbor")
    println("a)${numbor % 10 % 10}\t\tб)${numbor / 10}")
    println("в)${numbor / 10 / 10 + numbor / 10 % 10 + numbor % 10 % 10}\tг)${(numbor / 10 / 10) * (numbor / 10 % 10) * (numbor % 10 % 10)}")
}