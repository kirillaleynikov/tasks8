//Задача 3.
//Создать приложение, которое преобразует введенное пользователем натуральное число из 10-ичной системы в двоичную.

fun main(args: Array<String>)
{
    println("Введите десятичное число для перевода его в двоичную")
    val a: Int = readln()!!.toInt()
    val binary:String=Integer.toBinaryString(a)
    println(binary)
}