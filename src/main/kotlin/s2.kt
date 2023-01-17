import java.util.*
fun main(){
    println("Введите число")
    var num: Int= Scanner(System.`in`).nextInt()
    for (i in 0..num){
        if (i%2==0){
            println(i)
        }
    }
}