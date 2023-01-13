import java.util.*
fun main() {
    println("Введите числа, чере 'Enter'")
    var num1: Long = Scanner(System.`in`).nextLong()
    var num2: Long = Scanner(System.`in`).nextLong()
    var num3: Long = Scanner(System.`in`).nextLong()
    var num4: Long = Scanner(System.`in`).nextLong()
    val arr = arrayOf(num1, num2,num3, num4)
    var plus:Long =0
    var min:Long =0
    for(i in arr){
        if (i>0){
            plus++
        }
        else{
            min++
        }
    }
    println("положительных чисел :$plus , а отрицательных: $min")
}

