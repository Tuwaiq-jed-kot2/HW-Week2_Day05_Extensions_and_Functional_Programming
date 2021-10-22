fun main() {//part2-1
    val o =mutableListOf(12,1,4,76)
    val i =mutableListOf("a","b","c")
    val e = listOf(o,i)


    val result = o.filter { it >45 }
                    .map { it*2 }
                        .flatMap { i + it }


    println(result)

}

