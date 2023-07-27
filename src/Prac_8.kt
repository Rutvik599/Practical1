fun main(){
    var arr1 = arrayOf("Rutvik","Prachi","Margen","Aksh","Virpal")
    var arr2 = Array(5){9}
    var arr3 = Array(5){i -> i + 1}
    var arr4 = IntArray(5){it+2}
    var arr5 = intArrayOf(1,2,3,4,5)
    var arr6 = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )
    println("\narrayof() Function")
    for(i in arr1)
        print(" "+i)
    println("\nArray() Function")
    for(i in arr2)
        print(" "+i)
    println("\nArray() using lamda Function")
    for(i in arr3)
        print(" "+i)
    println("\nIntArray() Function")
    for(i in arr4)
        print(" "+i)
    println("\nintArrayof() Function")
    for(i in arr5)
        print(" "+i)
    println("\ncreating 2-d using arrayof() and intarrayof()  Function")
    for (i in arr6)
        println("[ ${i.joinToString(" , ")} ]")
    var arr7 = Array(5){0}
    for(i in 0..4){
        print("Enter the Array[$i] : ")
        arr7[i] = readLine()!!.toInt()
    }
    var sorted_array = arr7.sorted()
    println("\nArray before Sortin with inbuilt function() ")
    for(i in arr7)
        print(" "+i)
    println("\nArray after Sortin with inbuilt function() ")
    for(i in sorted_array)
        print(" "+i)
    for(i in 0 until arr7.size-1){
        for(j in 0 until arr7.size-i-1){
            if(arr7[j] > arr7[j+1]){
                var temp = arr7[j]
                arr7[j] = arr7[j+1]
                arr7[j+1] = temp
            }
        }

    }
    println("\nArray after Sortin without inbuilt function() ")
    for(i in arr7)
        print(" "+ i)
    }

