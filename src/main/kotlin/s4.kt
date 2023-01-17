fun main( ){
    println("Введите число")
    val numb:Int = readln().toInt()
    var coclc =1
    if(numb==0)
        println(1)
    else{
        for (i:Int in 1..numb){
            coclc*=i
        }
    }
    println(coclc)

    }
