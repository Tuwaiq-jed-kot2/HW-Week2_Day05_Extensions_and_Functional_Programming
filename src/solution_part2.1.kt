fun main() {
    // creating list with 2 elements from the product class (2 lists from item)
    val stock = listOf(Products(listOf("Milk","Bread")),Products(listOf("Orange","Apple")))
    /*flatmap the 2 lists in stock, then do some filtering to it, and then map the result to add "available"
    to each index */
    val tStock = stock.flatMap { it.item }.filter { it.length < 6 }.map { "$it available" }
    println(tStock)
}
// class that has one property (list of items)
class Products (val item:List<String>)