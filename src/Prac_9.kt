fun main(){
    var arr1 :ArrayList<Int> = ArrayList()
    for(i in 0 until 5 ){
        print("a[$i] : ")
        var temp = readLine()!!.toInt()
        arr1.add(temp)
    }
    println("\nThe Maximum number is : ${arr1.max()}")

}
/*Aim : Find the max number from ArrayList.*/
