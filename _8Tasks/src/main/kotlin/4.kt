//Задача 4.
//Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат. Символами
// операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. Числа могут быть вещественными.
// Числа и знак операции разделяются между собой одним пробелом. Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ

fun main(args: Array<String>)
{
    println("Введите первое число")
    val a: Float = readln()!!.toFloat()
    println("Введите второе число")
    val b: Float = readln()!!.toFloat()
    println("Введите символ операции")
    var sym:String= String()
    var res=0.0f
    var B = true
    sym= readln()

    if (sym=="*")
    {
        res=a*b
    }
    else if (sym=="/")
    {
        res=a/b
    }
    else if (sym=="+")
    {
        res=a+b
    }
    else if (sym=="-")
    {
        res=a-b
    }
    else
    {
        println("Ошибка операции! Проверьте вводимые данные")
        B= false
    }
    if(B) println("Результат операции: "+res)
}