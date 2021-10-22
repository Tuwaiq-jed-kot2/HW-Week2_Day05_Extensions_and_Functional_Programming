fun main (){

    //part 2
    //Q1

     val foods = listOf("pizza","steak","sandwich","hamburger")
    val drinks = listOf("pepsi","water","cola","coffee")

     val foodsAndDrinks = foods.filter { it.length > 5}
                                    .map { it + " meal" }
                                        .flatMap { drinks.filter { it.length > 4 } + it }

        println(foodsAndDrinks)


//****************************************************************************//

    // Q2
    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)

    var finalNumber = 0

     valuesToAdd.filterNot { it < 7 }
                    .map { it * 2 }
                        .forEach { finalNumber += it }

    println(finalNumber)
}









