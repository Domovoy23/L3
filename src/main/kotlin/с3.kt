fun main(){
    println("введите порядковый номер числа")
    var num:Int = readln().toInt()
    var caunt = 0
    var colc = mutableListOf(0,1)
    var add:Int=0
    if ((num==1) ) {

        println(0)
    }
    else{
        while (caunt+1!=num){
            add= colc[caunt]+colc[caunt+1]
            colc.add(add)

            caunt+=1
    }
        println(add)

    }
}