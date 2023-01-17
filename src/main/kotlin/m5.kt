import kotlin.random.Random
fun main(){
    var random = List(10) { Random.nextInt(0, 10) }
    random=random.sorted()
    println(random)
}