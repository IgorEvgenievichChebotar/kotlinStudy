package task1basics

fun main() {
    task6()
}

fun task2() {
    var five: Int = 5
    var f: Char = 'F'
    var hello: String = "Привет"
    var num: Float = 90.2F

    val nonMutable: Int = 67

    println(hello)
}

fun task3() {
    val nums = readLine()!!.map { it.toString().toInt() }
    println(nums)
}

fun task4() {
    val days = 2642

    println("Days: $days")
    println("Years: ${days / 365}")
    println("Weeks: ${days / 7}")
}

fun task5(){
    val n = readLine()!!.toInt()
    println(n + n * 2)
}

fun task6(){
    print("Name: ")
    val name = readLine()
    print("Age: ")
    val age = readLine()!!.toInt()

    println("Привет, $name Тебе уже $age")
}
