class Car(val owner:String){
    var carPrice :Int = 0
    var ogCarPrice :Int = 0
    var year :Int = 0
    var model:String = ""
    var milesDriven:Int = 0

    init{
        print("How much your Car is Driven in Miles : ")
        milesDriven = readLine()!!.toInt()
    }
    fun getCarInformation(){
        print("\nEnter Car Model Name : ")
        model = readLine()!!
        print("\nEnter Car Year : ")
        year = readLine()!!.toInt()
    }
    fun getCarPrice(){
        getCurrentCarPrice()
        getOriginalCarPrice()
    }
    fun getOriginalCarPrice(){
        print("\nEnter Original Car Price : ")
        ogCarPrice = readLine()!!.toInt()
    }
    fun getCurrentCarPrice(){
        print("\nEnter Car Price : ")
        carPrice = readLine()!!.toInt()
    }
    fun displayCarInfo(){
        print("\nCar Information : ${model} ,${year}\nCar Owner : ${owner}\nMiles Drive ${milesDriven}\nOriginal Car Price : ${ogCarPrice}\nCurrent Car Price : ${carPrice}")
    }
}
fun main(){
    var car_object1 = Car("Rutvik")
    car_object1.getCarInformation()
    car_object1.getCarPrice()
    car_object1.displayCarInfo()
}