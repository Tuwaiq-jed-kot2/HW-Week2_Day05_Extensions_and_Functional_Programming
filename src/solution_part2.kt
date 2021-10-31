fun main() {

    val x = listOf(2, 4, 6 ,8)
    val n = listOf(1,3, 5 ,7)

    val result =x.filter { it>4 }
        .map { it*2 }
        .flatMap {n+it}



    println(result)

    var i = 0
    var xi = mutableListOf(1,18,73,3,44,6,13,33, 2, 22,5,7,32, 11,9,8,24)
        .filterNot { it < 7 }
        . map { it * 2 }
        .forEach{i += it}




    println(i)

}



