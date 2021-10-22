fun main() {
    //Create 3 functional chains using map, flatMap, and filter.

    val valuesToSub = listOf(listOf(45, 77), listOf(6, 8), listOf(7, 99), listOf(10, 4, 22))
    var newValuesToSub = valuesToSub.flatMap { it }
                                      .filter { it < 9 }
                                         .map { it - 2 }
    println(newValuesToSub)

//Using a functional programming approach using this list val valuesToAdd
// = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)

    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    var finalResult = 0
    val newValuesToAdd = valuesToAdd.filterNot { it < 7 }//Exclude any number less than 7.
                                      .map { it * 2 }//Multiply each number by 2
                                         .forEach {
            finalResult += it //Sum the resulting products to produce a final number.
        }
    println(finalResult)
}

