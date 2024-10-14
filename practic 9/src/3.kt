import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите сумму в исходной валюте:")
    val summa = scanner.nextDouble()
    println("Введите код исходной валюты (USD, EUR, RUB):")
    val ValuteA = scanner.next().uppercase()
    println("Введите код валюты, в которую нужно конвертировать (USD, EUR, RUB):")
    val ValuteB = scanner.next().uppercase()

    val converted = convertValutu(summa, ValuteA, ValuteB)

    if (converted != null) {
        println("$summa $ValuteA = $converted $ValuteB")
    } else {
        println("Не удалось найти курс обмена для этой валютной пары.")
    }
}

fun convertValutu(summa: Double, IzValuti: String, VValutu: String): Double? { // Курс на момент 12.10.2024
    val a = mapOf(
        "USD" to mapOf(
            "EUR" to 0.91432,
            "RUB" to 96.07
        ),
        "EUR" to mapOf(
            "USD" to 1.09,
            "RUB" to 105.11
        ),
        "RUB" to mapOf(
            "USD" to 0.010409,
            "EUR" to 0.009514
        )
    )

    val rate = a[IzValuti]?.get(VValutu)
    if (rate != null) {
        return summa * rate
    }
    return null
}
