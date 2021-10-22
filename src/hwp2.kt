fun main (){
    val y = listOf(22,34,45,55,67)
    val x = listOf("shtgfj","jgj","543")
    val result = y.filter { it >55 }
        .map { it*3 }
        .flatMap { x+it }

    println(result)
}