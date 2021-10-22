//Part II - Functional Programming Basics.

//Create 3 functional chains using map, flatMap, and filter.
fun main() {
    var x = mutableListOf ("red","blue","green", "black","pink")
    var y = mutableListOf("pen","flag","flower","mug","glass")
    var b = x.map { it + "O" }.filter{ it.length>5 }
    val m = y.flatMap {x.filter { it.length<5 } -it }

        println(b)
        println(m)
}




// Using a functional programming approach using this list
fun main() {
    val aa = mutableListOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    var num=0
    val x=aa.filter { it <7 }.map { it*2 }.forEach {it += 0 }

    println(x)

}


