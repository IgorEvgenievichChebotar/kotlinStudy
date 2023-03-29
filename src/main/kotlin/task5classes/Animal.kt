package task5classes

open class Animal(var food: String, var location: String) {
    open fun makeNoise() {
        println("Животное спит")
    }

    open fun eat() {
        println("Животное ест $food")
    }

    open fun sleep() {
        println("Животное спит")
    }
}

class Dog(food: String, location: String, var breed: String) : Animal(food, location) {
    override fun makeNoise() {
        println("$breed шумит: Гав-гав!")
    }

    override fun eat() {
        println("$breed кушает $food")
    }
}

class Cat(food: String, location: String, var color: String) : Animal(food, location) {
    override fun makeNoise() {
        println("$color кот мурлычет")
    }

    override fun eat() {
        println("$color кот ест $food")
    }
}

class Horse(food: String, location: String, var breed: String) : Animal(food, location) {
    override fun makeNoise() {
        println("$breed ржёт: Игого!")
    }

    override fun eat() {
        println("$breed ест $food")
    }
}

class Veterinarian {
    fun treatAnimal(animal: Animal) {
        println("Ветеринар обслуживает ${animal.javaClass.simpleName}, еда: ${animal.food}, местоположение: ${animal.location}")
    }
}

fun main() {
    val animals = arrayOf(
        Dog("кости", "дом", "Доберман"),
        Cat("рыба", "дом", "белый"),
        Horse("сено", "стойло", "Андалузский")
    )

    val veterinarian = Veterinarian()

    for (animal in animals) {
        veterinarian.treatAnimal(animal)
        animal.makeNoise()
        animal.eat()
        animal.sleep()
    }
}