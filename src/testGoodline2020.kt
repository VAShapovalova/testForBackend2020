package testGoodline2020

fun main(args: Array<String>) {
    val inputArray = {
            args: Array<String> -> if (args.size != 0) args else readLine()!!.filterNot { v -> "\"".contains(v) }.split(" ").toTypedArray()
    }

    level5(inputArray(args))
}

fun level1(array: Array<String>) {
    array.forEach { println(it) }
}

fun level2(array: Array<String>) {
    array
        .sorted()
        .forEach { println(it) }
}

fun level3(array: Array<String>) {
    array
        .toSet()
        .sorted()
        .forEach { println(it) }
}

fun level4(array: Array<String>) {
    array
        .groupingBy { it }
        .eachCount()
        .forEach { println("${it.key} ${it.value}") }
}

fun level5(array: Array<String>) {
    array
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedWith(compareBy({ -it.second }, { it.first }))
        .forEach { println("${it.first} ${it.second}") }
}
