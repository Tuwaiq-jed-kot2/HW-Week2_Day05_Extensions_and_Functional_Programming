import java.util.Collections.list

fun main() {
    val r=part1()
    val p=part2()

}



fun part1 (){
    //Create 3 functional chains using map, flatMap, and filter.
    val animal= listOf<String>("Monkey","Taiger","Fox","Sheep","Lion","Cat")
     val thisLestJustForTryingFlatMap = listOf<String>("Fox")
    val m = mutableListOf(5, 10, 6, 7, 8, 9, 4, 1, 2, 3)
    val result = m.filter { it>=7 }
        .map { it - 5 }
    val result2 =thisLestJustForTryingFlatMap.flatMap { animal.filter { it.length>5 } }
    println("$result2\n")
    println("$result\n")

}
















fun part2(){
//Using a functional programming approach using this list val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
//Exclude any number less than 7.
//Multiply each number by 2.
//Sum the resulting products to produce a final number.

    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)

    val result=valuesToAdd.filter { it>7 }
                            .map { it*2 }

    println("the list before sum it\n$result\n")
    println("the sum of the list = ${result.sum()}")
}