fun main(){
    var x=evenIndices(listOf("Paccy","kayitete","AkiraChix","Elizabeth","Joyce","Lucy","Zipporah","Joanah","Umulisa","Benadate"))
    println(x)

   var y= peopleHeights(listOf(1,2,3,5,6,8))
    println(y)

    var student1=Person("Pascaline",20,1.0,45.0)
    var student2=Person("ELizabeth",17,1.9,60.1)
    var student3=Person("Lucy",30,2.0,30.4)
    var student4=Person("Zuennah",25,1.2,75.0)
    var listStudent=mutableListOf(student1,student2,student3,student4)
    sorting(listStudent)

    var student5=Person("Verite",38,1.5,65.0)
    var student6=Person("Salma",78,1.9,17.8)
    var otherStudent= mutableListOf(student5,student6)
    otherPeople(listStudent,otherStudent)

    var myCar=Car("09889",23.5)
    var youCar=Car("475533",45.8)
    var ourCar=Car("435224",10.6)
    var finalAverage=carLists(listOf(myCar,youCar,ourCar))
    println(finalAverage)



}
fun evenIndices(words:List<String>):List<String>{
    var evenList= mutableListOf<String>()
    words.forEachIndexed{x,i->
        if(x%2==0){
            evenList.add(i)
        }
    }
    return evenList
}
fun peopleHeights(heights:List<Int>):String{
    var sum=heights.sum()
    var avg=heights.sum()/heights.count()
    var f="$avg meters, $sum meters"
    return f
}
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)
fun sorting(people:List<Person>){
    var sortedList=people.sortedByDescending { person->person.age }
    println(sortedList)
}
fun otherPeople (similarList:List<Person>,newlist:List<Person>):List<Person>{
   var addedLists= similarList.plus(newlist)
    println(addedLists)
    return addedLists


}
data class Car(var registration:String,var mileage:Double)
fun carLists(cars:List<Car>):Double{
    var sum=0.0
    cars.forEach { car->
        sum+=car.mileage
    }
    return sum/cars.count()
}
