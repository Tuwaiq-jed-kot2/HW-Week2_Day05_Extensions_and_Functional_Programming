//
part1Q2

fun main () {


    val Example= listOf(listOf(22, 23, 44, 5,43),listOf(1, 28, 884, 87,0))


    val Homework =Example.flatMap{ it  }
    print(Homework)
}

////Part2Q2

fun main (){
    val valuesToAdd = mutableListOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 11, 9, 8, 24)
    val End=valuesToAdd.filter {it >7}
        .map{it*2}
    print(End)
}