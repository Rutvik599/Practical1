fun main() {  //practical 1.1 
    var number1 = 10;
    var number2 = 20;
    // Swapping Two variable Without using third variable
    println("Before Swapping the Variable a = " + number1 + " and b = " + number2)
   	number1 = number1 + number2
    number2 = number1 - number2
    number1 = number1 - number2
    println("Before Swapping the Variable a = " + number1 + " and b = " + number2)
    
    // Swapping two variable with using third variable 
    println("*************************************")
    println("Before Swapping the Variable a = " + number1 + " and b = " + number2)
    var temp = number1
    number1 = number2
    number2 = temp
    println("Before Swapping the Variable a = " + number1 + " and b = " + number2)
}
