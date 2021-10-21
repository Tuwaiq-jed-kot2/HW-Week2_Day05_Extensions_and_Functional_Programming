//----------------------first part---------------------

fun main() {
    val nissanCars = listOf("patrol","maxima","versa")
    val toyotaCars = listOf("land cruiser","avalon","camry")

    val carsMap = toyotaCars.filter { it.length >5 }.map {it + nissanCars.filter {it.length >5  }}
    val carsFlatMap = toyotaCars.filter { it.length >5 }.flatMap { nissanCars.filter { it.length >5 } + it }.toSet().toList()

    println(carsMap)
    println(carsFlatMap)

//----------------------second part---------------------
    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)

    var sumOfList = 0

    valuesToAdd.filter { it < 7 }
                    .map { it *2 }
                        .forEach {sumOfList += it}

    println(sumOfList)

}