package task5classes

class Words {
    init {
        println("класс ${this.javaClass.simpleName} создан")
    }
}

fun main() {
    print("Имя: ")
    val name = readln()
    Message(name).introduce()
}

class Message(private val name: String) {
    fun introduce() {
        println("Привет, меня зовут $name")
    }
}