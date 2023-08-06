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
    println("Rutvik Patel_21012021081\n *----------------------------- Object Created by manually ----------------------------*")
    var car_object1 = Car("Rutvik")
    car_object1.getCarInformation()
    car_object1.getCarPrice()
    car_object1.displayCarInfo()

    println("\n *------------------------- Object Created by ArrayList<>() ---------------------------------* ")
    var car_object_list = ArrayList<Car>()
    car_object_list.add(Car("Margen"))
    car_object_list[0].getCarInformation()
    car_object_list[0].getCarPrice()
    car_object_list[0].displayCarInfo()
}

/* Aim : Write Different types of Class & Constructor. Create a class Car and set various members like type, model, price, owner, milesDrive. add the function getCarPrice in it. Create an object of Car class and access property of it. (getCarInformation(), getOriginalCarPrice(), getCurrentCarPrice(), displayCarInfo() etc.)
*/