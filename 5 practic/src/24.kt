fun main() {
    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    val transposed = Array(matrix[0].size) { IntArray(matrix.size) }

    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            transposed[j][i] = matrix[i][j]
        }
    }

    println("Транспонированная матрица:")
    for (row in transposed) {
        println(row.joinToString(" "))
    }
}