package task2conditions

fun main() {
    task7()
}

fun task7() {
    print("Число 1: ")
    val num1 = readln().toInt()
    print("Число 2: ")
    val num2 = readln().toInt()

    println(num1 % 2 == 0 && num2 % 2 == 0)
}

fun task6() {
    print("Убытки: ")
    val loss = readln().toInt()
    print("Прибыль: ")
    val profit = readln().toInt()
    val result = profit - loss

    if (result > 0) println("Прибыль: $result")
    else println("Убытки: ${-result}")
}

fun task5() {
    print("Число 1: ")
    val num1 = readln().toInt()
    print("Число 2: ")
    val num2 = readln().toInt()
    print("Число 3: ")
    val num3 = readln().toInt()

    if (num1 == num2 || num2 == num3 || num1 == num3) {
        println("Ошибка, числа совпадают")
        return
    }

    val avg = listOf(num1, num2, num3).sorted()[1]

    println("Среднее из 3х чисел: $avg")
}

fun task4() {
    when (readln().toInt()) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
        else -> println("Неверное число, день недели неопределен")
    }
}

fun task3() {
    val num1 = 2
    val num2 = 6
    val menu = """
        |У вас есть числа: $num1 и $num2
        |1. Добавить
        |2. Отнять
        |0. Ничего
    """.trimMargin()

    println(menu)
    val userInput = readLine()!!
    when (userInput.toInt()) {
        1 -> {
            val sum = num1 + num2
            println("Результат: $sum")
        }

        2 -> {
            val difference = num1 - num2
            println("Результат: $difference")
        }

        0 -> println("Вы ничего не выбрали")
        else -> println("Некорректный выбор")
    }
}

fun task2() {
    print("Возраст: ")
    val age = readln().toInt()
    when {
        age > 18 -> println("Вам уже все можно")
        age == 18 -> println("Ура, Вам 18 лет!")
        age < 18 -> println("Вы еще слишком молоды")
    }
}

fun task1() {
    println(if (20 % 17 > 0) "Получилось значение большее чем ноль!" else "")
}
