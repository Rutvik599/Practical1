fun main(){
    println("Rutvik Patel_21012021081\nEnter Number : ")
    var fact_value = readLine()!!.toInt()
    println("The factorial value of $fact_value is ${fact(fact_value)} ")

}
tailrec fun fact(number:Int) :Int {
    if(number > 1)
        return number * fact(number-1)
    else
        return 1
    }
/*Aim : Find the factorial of number by recursion. Explain "tailrec" keyword. */