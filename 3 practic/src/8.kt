fun main() {
    print("Введите расстояние в километрах: ")
    val distanceKilometers = readLine()!!.toDouble()

    print("Введите расстояние в футах: ")
    val distanceFeet = readLine()!!.toDouble()

    val distanceMeters = distanceFeet * 0.305 // Преобразование футов в метры

    if (distanceKilometers * 1000 < distanceMeters) {
        println("Расстояние в километрах меньше.")
    } else if (distanceKilometers * 1000 > distanceMeters) {
        println("Расстояние в футах меньше.")
    } else {
        println("Расстояния равны.")
    }
}
