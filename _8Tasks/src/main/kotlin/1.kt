//Задача 1.
//Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке. На вход подается,
//например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4. То есть, если количество подряд идущих символов меньше
//двух, то мы не пишем единицу

fun main(args: Array<String>)
{
    println("Введите строку")
    var a:String= String()
    a= readln()
    var out = ""
    var c:Char=a[0];
    var n:Int=0;
    a.forEach {Char
        if (c!=it){
            out+=c+if (n.toString()!="1") n.toString() else ""
            n=0
        }
        n++;
        c=it
    }
    out+=c+if (n.toString()!="1") n.toString() else ""
    println("Количество подряд идуших одинаковых символов во введённой строке")
    println(out)
}