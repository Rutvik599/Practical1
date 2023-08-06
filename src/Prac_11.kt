class Matrix(private val rows: Int, private val columns: Int) {
     var values = Array(rows) { IntArray(columns){0} }
    operator fun plus(other: Matrix): Matrix {
        val result = Matrix(rows, columns)
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                result.values[i][j] = values[i][j] + other.values[i][j]
            }
        }
        return result
    }

    operator fun minus(other: Matrix): Matrix {
        val result = Matrix(rows, columns)
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                result.values[i][j] = values[i][j] - other.values[i][j]
            }
        }
        return result
    }

    operator fun times(other: Matrix): Matrix {
        val result = Matrix(rows, other.columns)
        for (i in 0 until rows) {
            for (j in 0 until other.columns) {
                for (k in 0 until columns) {
                    result.values[i][j] += values[i][k] * other.values[k][j]
                }
            }
        }
        return result
    }

    override fun toString(): String {
        val sb = StringBuilder()
        for (i in 0 until rows) {
            for (j in 0 until columns) {
                sb.append("${values[i][j]}\t")
            }
            sb.append("\n")
        }
        return sb.toString()
    }
    fun getvalue(str:String){
        println("Matrix : $str[$rows[[$columns] : ")
        for(i in 0 until rows){
            for(j in 0 until columns){
                print("\n$str[$i][$j] : ")
                this.values[i][j] = readLine()!!.toInt()
            }
        }
    }
}
fun main() {
    val first_mat = Matrix(3, 2)
    val second_mat = Matrix(3, 2)
    val third_mat = Matrix(2, 3)
    first_mat.getvalue("A")
    second_mat.getvalue("B")
    third_mat.getvalue("C")
        val sum = first_mat + second_mat
        println("first_mat + second_mat:")
        println(sum)
        val diff = first_mat - second_mat
        println("first_mat - second_mat:")
        println(diff)
        val product = first_mat * third_mat
        println("first_mat * third_mat:")
        println(product)
}
