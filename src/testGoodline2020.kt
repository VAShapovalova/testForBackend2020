package testGoodline2020

fun main() {
    level5()
}
fun level1(){
    var stroke = readLine()!!.split(" ")
        .forEach{println(it)}
}
fun level2(){
    var stroke = readLine()!!.split(" ")
        .sorted()
        .forEach{println(it)}
}
fun level3(){
    var stroke = readLine()!!.split(" ")
        .toSet()
        .sorted()
        .forEach{println(it)}
}
fun level4(){
    var stroke = readLine()!!.split(" ")
        .groupingBy{it}
        .eachCount()
        .forEach{println("${it.key} ${it.value}")}
}
fun level5(){
    var stroke = readLine()!!.split(" ")
        .groupingBy{it}
        .eachCount()
        .toList()
        .sortedWith(compareBy({-it.second}, {it.first}))
        .forEach{println("${it.first} ${it.second}")}
}