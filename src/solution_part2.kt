/*---------------------------------Part I -------------------------------------------*/
/*--------------------------------Answer Q1 -----------------------------------------*/
//data class Students(val name: String, val age: Int, val gender: String)
//
//fun main() {
//    val boys = listOf(Students("Naif", 29, "male"), Students("Mohammed", 30, "male"))
//    val girls = listOf(Students("lila", 25, "female"), Students("Maha", 31, "female"))
//    val classes = listOf(boys,girls)
//    println(classes.flatMap { it })
//    val studentNames= classes.flatMap { it }.map { it.name }.filter { it.length > 5 }
//    println(studentNames)
//    val ages = classes.flatMap { it }.map { it.age }.filter { it>20 }
//    println(ages)
//}

/*--------------------------------Answer Q2 -----------------------------------------*/
fun main() {
    val valuesToAdd = listOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    var afterOperations = 0
    var results1 = valuesToAdd.filter { it< 7 }
    println(results1)
    var results2 = valuesToAdd.filter { it< 7 }.map { it * 2 }
    println(results2)
    var results3 = valuesToAdd.filter { it< 7 }.map { it * 2 }.forEach {afterOperations += it}
    println(afterOperations)
}