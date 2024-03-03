open class Animal(val name: String, val age: Int){
    fun walk(){
        println("$name can walk")
    }
}

class Flyer(
    name: String,
    age: Int
):  Animal(name, age){
    fun fly(){
        println("$name can fly")
    }
}

fun main(){
    val animal1 = Animal("gorilla",15)
    val animal2 = Flyer("blackbird",16)
    val animal4 = Flyer("hawk",14)
    val animal3 = Animal("tiger",33)

    val creatures = listOf<Animal>(animal1, animal2, animal3, animal4)
    for (animal in creatures){
        animal.walk()
    }
}
