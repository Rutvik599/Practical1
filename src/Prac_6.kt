fun main(){
    math(6,3,"+")
    math(5,2,"-")
    math(6,2,"*")
    math(10,2,"/")
}

fun math(number1:Int,number2:Int,choice:String){
    when(choice){
        "+" -> println("Sum : " +(number1+number2))
        "-" -> println("Sub : " + (number1-number2))
        "*" -> println("Mul : " + (number1*number2))
        "/" -> println("Div : " + (number1/number2))
        else -> print("Enter the valid !")
    }
}

/*Aim : By using a user defined function perform all arithmetic operations.*/