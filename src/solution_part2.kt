
fun main() {
    val xmap= mutableListOf(25,26,27,28,29,30)
     val ymap= mutableListOf(40,44,45,64,46)
    val rr= xmap.filter{it<30}   // filter less end 30
                      .map { it*4 }    // map Multiply *4
                          .flatMap { ymap.filter { it<30 }+it } //flatmap ymap

    println(rr)



    val rs= listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    val rre=rs.filterNot { it<7 }
                   .map { it*2 }
                         .sum()

    println(rre)



}

