fun main() {
    val valuesToAdd = mutableListOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    var finalresult=0
   // val value= listOf("99","88","77")
    val resultVal= valuesToAdd.filter { it<7 }
                                    .map { it*2 }
                                      .forEach { finalresult+=it }
    println(finalresult)



}