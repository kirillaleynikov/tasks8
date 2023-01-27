//Задача 2.
//Создать приложение, которое подсчитывает количество различных символов во введенной строке. Символы в ответе расположить в алфавитном порядке.
//Например, дана строка AASADDSS. На выходе получаем:
//A - 3
//D - 2
//S - 3

fun main(args: Array<String>)
{
    println("Введите строку")
    var a:String= String()
    a= readln()
    val chars = a.toCharArray()
    chars.sort()
    a=String(chars)
    var str = a.groupingBy { it }.eachCount()
    println("Количество различных символов во введенной строке:")
    println(str)
}