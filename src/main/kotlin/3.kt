import java.util.*
fun main(){
    println("Введите стороны триугольника, чере 'Enter'")
    var side1: Long = Scanner(System.`in`).nextLong()
    var side2: Long = Scanner(System.`in`).nextLong()
    var side3: Long = Scanner(System.`in`).nextLong()
    if( (side1 == side2) or (side2 == side3) or (side3==side1)){
        println("Треугольник равнобедренный")
        if ((side2===side1) and (side2===side3) ){
            println("Треугольниу равносторонний")
        }
    }

    else{
        println("Треугольник разносторонний")
    }
}