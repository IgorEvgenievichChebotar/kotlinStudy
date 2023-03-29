package task4funcs

fun main() {
    print("Число: ")
    val num = readln().toInt()
    task2(num)
}

fun task2(num: Int) {
    val lastDigit = num.toString().last().digitToInt()
    when (lastDigit) {
        0 -> println("$num лет")
        1 -> println("$num год")
        in 2..4 -> println("$num года")
        in 5..9 -> println("$num лет")
    }
}

fun task1(num: Int) {
    val firstDigit = num.toString().substring(0, 1)
    println("${firstDigit}K")
}
