fun main() {

    //PartII
    //Q1

    val numbers = listOf((0..10).toList(),
                        (11..20).toList())

    val odd = numbers.flatMap { it }
                        .filter { it %2 == 0 }
                                 .map { "${ it + 1 } is odd number"  }



    println(odd)




    //Q2
    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)

    var finalResult = 0

    val result = valuesToAdd.filter { it < 7 }
                                    .map { it * 2 }
                                            .forEach { finalResult += it }

    println(finalResult)



}





