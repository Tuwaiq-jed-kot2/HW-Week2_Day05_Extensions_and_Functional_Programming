fun main() {

    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
                            .filterNot { it < 7 } // Exclude any number less than 7.
                                      .map { it*2 } // Multiply each number by 2
                                        .sum() //Sum the resulting products to produce a final number

    println(valuesToAdd)

}