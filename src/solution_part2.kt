fun main() {

    println("-------------------------part1-----------------------------------")
    // FlatMap is used to combine two different collections and returns as a single collection
    val hotCoffee = listOf("espresso","cortado","cappuccino","Macchiato","Mocha")
    val coldCoffee = listOf("Cold-Brew","White-Mocha","Iced-Macchiato")

    val CoffeeDrinks = hotCoffee.filter { it.length >5 }.flatMap { coldCoffee.filter { it.length >3 } + it }
    println(CoffeeDrinks)

    println("-------------------------part2-----------------------------------")
    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    var sum=0

    valuesToAdd.filter { it < 7 }
                 .map { it *2 }
                    .forEach {sum += it}
    println(sum)
}