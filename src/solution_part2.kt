// -------part 2 -a
//Create 3 functional chains using map, flatMap, and filter.

fun main() {
    val bonus = 5
    val a = listOf(3,3,3,3,3)
    val x = listOf(11,22,33,55,66,77,88)
        .filter { it <60 }
        .map { it + bonus }
    println(x)
    val flatmap =a.flatMap { x }

    println(flatmap)
}

// part 2 - b

fun main (){
    var result =0
    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
        .filterNot { it<7 }
        .map { it*2 }
        .forEach {
            result =+ it
        }
    println(result)

}


