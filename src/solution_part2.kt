
fun main() {

    //- Create 3 functional chains using map, flatMap, and filter.
    val fruitVegetables = listOf(Data(listOf("Apple", "Banana", "Peach")), Data(listOf("Cucumber", "Carrot", "Tomato")))

    val chaining = fruitVegetables.flatMap { it.items }
                                         .filter { it.length > 5 }
                                             .map { "$it!" }
    println(chaining)

    //- Using a functional programming approach using this list

    var result = 0
    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
                        .filterNot{ it < 7 }
                                .map { it * 2 }
   // println(valuesToAdd)
                                     .forEach {
                                         result += it
                                     }
    println(result)
}

    class Data(val items: List<String>)





