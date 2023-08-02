class mainMatrix(private val rows: Int, private val colums: Int) {
        val values = Array(rows) {
        IntArray(colums)
    }
    operator fun plus(other: mainMatrix): mainMatrix {
        if (rows != other.rows || colums != other.colums) {
            println("Both matrix is not a same size ! ")
            System.exit(0)
        }

        val val_results = mainMatrix(rows, colums)
        for (i in 0 until rows) {
            for (j in 0 until colums) {
                val_results.values[i][j] = this.values[i][j] + other.values[i][j]
            }
        }
        return val_results
    }
    operator fun minus(other: mainMatrix): mainMatrix {
        if (rows != other.rows || colums != other.colums) {
            println("Both matrix is not a same size ! ")
            System.exit(0)
        }

        val val_results = mainMatrix(rows, colums)
        for (i in 0 until rows) {
            for (j in 0 until colums) {
                val_results.values[i][j] = this.values[i][j] - other.values[i][j]
            }
        }
        return val_results
    }
    operator fun times(other: mainMatrix): mainMatrix {
        if (colums != other.rows) {
            println("Both matrix is not a same size ! ")
            System.exit(0)
        }

        val val_results = mainMatrix(rows, other.colums)
        for (i in 0 until rows) {
            for (j in 0 until other.colums) {
                var sum = 0
                for (k in 0 until colums) {
                    sum += this.values[i][k] * other.values[k][j]
                }
                val_results.values[i][j] = sum
            }
        }
        return val_results
    }
    override fun toString(): String {
        val sb = StringBuilder()
        for (row in values) {
            sb.append(row.joinToString(" "))
            sb.append("\n")
        }
        return sb.toString()
    }
}
fun main() {
    val matrix1 = mainMatrix(3, 3)
    println("Enter first matrix values : ")
    for(i in 0 until 3 ){
        for(j in 0 until 3 ){
            print("\nmatrix1[$i][$j] : ")
            matrix1.values[i][j]= readLine()!!.toInt()
        }
    }

    val matrix2 = mainMatrix(3, 3)
    println("Enter second matrix values : ")
    for(i in 0 until 3 ){
        for(j in 0 until 3 ){
            print("\nmatrix2[$i][$j] : ")
            matrix2.values[i][j]= readLine()!!.toInt()
        }
    }
    val matrixSum = matrix1 + matrix2
    val matrixDifference = matrix1 - matrix2
    val matrixProduct = matrix1 * matrix2

    println("mainMatrix 1:")
    println(matrix1)

    println("mainMatrix 2:")
    println(matrix2)

    println("mainMatrix Sum:")
    println(matrixSum)

    println("mainMatrix Difference:")
    println(matrixDifference)

    println("mainMatrix Product:")
    println(matrixProduct)
}

