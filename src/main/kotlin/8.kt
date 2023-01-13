import java.util.*
fun main() {
    println("""Выберите блюдо из меню:
        1) Борщ - 120
        2) Пельмени - 150
        3) Солянка - 100
    """.trimMargin())
    val eat = arrayOf("", "Борщ","Пельмени", "Солянка")
    val cost= arrayOf(0 , 120, 150,100)
    var choose: String= readln()
    println("Ввeдите сумму денег")
    var money:Int = Scanner(System.`in`).nextInt()
    if(cost[eat.indexOf(choose)] == money){
        println("Спасибо за покупку!")
    }
    else if (cost[eat.indexOf(choose)] < money){
        val change=money-cost[eat.indexOf(choose)]
        println("Ваша сдача: $change")
    }
    else{
        println("Денег не хватает!")
    }

}


