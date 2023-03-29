package task3cycles

fun main() {
    task6()
}

fun task6() {
    var sum = 0
    var i = 5
    while (i <= 57) {
        i++
        if (i == 34 || i == 46 || i == 52) continue
        sum += i
    }
    println("Сумма: $sum")
}

fun task5() {
    var sum = 0
    for (i in 1..100) {
        if (i % 4 == 0) sum += i
    }
    println("Сумма: $sum")
}

fun task4() {
    print("Число: ")
    val num = readln().toInt()

    var even = 0;
    var odd = 0;

    val digits = num.toString().split("").drop(1).dropLast(1)
    for (d in digits) {
        if (d == "0") continue
        if (d.toInt() % 2 == 0) even++
        else odd++
    }

    println("Чётных: $even")
    println("Нечётных: $odd")
}

fun task3() {
    print("Число: ")
    val num = readln().toInt()
    for (i in 1..num) {
        if (num % i == 0) println(i)
    }
}

fun task2() {
    val num = 2
    while (true) {
        print("Число от 1 до 9: ")
        if (readln().toInt() == num) break
    }
}

fun task1() {
    for (i in 1..5) {
        println(i.toString().repeat(i))
    }
}
