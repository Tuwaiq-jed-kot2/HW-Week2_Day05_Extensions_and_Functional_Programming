fun main() {
//----------p1---------

    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    var sumResult = 0
    var result = valuesToAdd.filter { it > 7 }
        .map { it * 2 }
        .forEach { sumResult += it }

           println(sumResult)


    //-----------------p2---------------

    val studendgree =
        mapOf("Mha" to "D", "Bashayer" to "A+", "Ahmad" to "B", "Milaf" to "B+", "Sara" to "c", "Jasmin" to "A+")
    var x = studendgree.filter { it.value <= "B+" }
        .filter { it.key.length > 5 }
        .map { (key, value) -> "$key pass with $value, this year" }
             println(x)

//---------another example--------------

    val studentName = listOf("Mha", "Bashayer", "Ahmad")
    var y = studentName.filter { it.length > 4 }
        .flatMap { it.toList() }
        .filter { it.equals('a') }
             println(y)

}
