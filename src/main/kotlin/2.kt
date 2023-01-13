import java.util.*
fun main(){
    println("Введите первое число")
    var n1: Long = Scanner(System.`in`).nextLong()
    println("Введите второе число")
    var n2: Long = Scanner(System.`in`).nextLong()
    if (n1>n2){
        println("первое число больше, чем второе")
    }
    else{
        println("второе число больше, чем первое ")
    }
}