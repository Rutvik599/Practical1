fun main(){
    println("Enter Any Number : ")
    var number1 = readLine()!!
    if(number1.toInt()%2 != 0)
        println("Number is Odd")
    else
        println("Number is Even")
}