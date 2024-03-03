open class Person(protected val name: String, protected val age: Int){
    fun walk(){
        println("$name can walk")
    }
}

class Driver(
    name: String,
    age: Int,
    val experience: Int
):  Person(name, age){
    fun drive(){
        println("$name can drive")
    }
}

fun main(){
    val person1 = Person("Иван",15)
    val person2 = Person("Иоан",16)
    val driver1 = Driver("Карл",33,10)
    val people = ListOf<Person>(person1, person2, driver1)
    for (person in people){
        person.walk
    }
}
