import java.util.*
fun main() {
    println("Введите числа, через 'Enter'")
    var num1: Long = Scanner(System.`in`).nextLong()
    var num2: Long = Scanner(System.`in`).nextLong()
    var num3: Long = Scanner(System.`in`).nextLong()
    val arr: Array<Long> = arrayOf(num1,num2, num3 )
    arr.sort()
    println(arr.first()+arr.last())
}