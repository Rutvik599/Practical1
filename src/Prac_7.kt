fun main(){
    println("Factorial of 5 : "+fact(5))
}
fun fact(number:Int) :Int {
    if(number > 1)
        return number * fact(number-1)
    else
        return 1
    }