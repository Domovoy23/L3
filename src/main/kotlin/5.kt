import java.util.*
fun main() {
    println("Введите числа, чере 'Enter'")
    var num1: Long = Scanner(System.`in`).nextLong()
    var num2: Long = Scanner(System.`in`).nextLong()
    var num3: Long = Scanner(System.`in`).nextLong()
    if ((num1> num2) and (num1>num3)) {
        println("$num1")

    }
    if ((num2>num1) and (num2>num3)){
        println("$num2")
    }
    if((num3>num1) or (num3>num2)){
        println("$num3")
    }
}