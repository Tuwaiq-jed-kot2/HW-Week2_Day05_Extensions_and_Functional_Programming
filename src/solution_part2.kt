fun main() {

    val counties = listOf(
        "Saudi Arabia", "London", "Swiss", "Poland",
        "France", "Egypt", "Sudan"
    )


    println(counties.filter { it.length > 4 }.map { it.uppercase() }.flatMap { it.chunked(1) })


    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 1, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    println(valuesToAdd.filter { it > 7 }.map { it * 2 }.fold(0)
    { total, valuesToAdd: Int -> total + valuesToAdd })
}


