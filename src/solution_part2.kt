fun main() {

    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    var result = valuesToAdd.filter { it > 7}
                                .map { it * 2 }

    println(result)
    println(result.sum())
}