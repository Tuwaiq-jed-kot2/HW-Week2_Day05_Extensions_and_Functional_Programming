fun main() {
    val list1= mutableListOf<Int>(1,2,3)
    val list2= mutableListOf<Int>(4,5,6)
    val i =2
    var m=  list1.flatMap { list2 }
    println(m)
    m.map { it*it }
    println(m)
    m.filter { it<5 }
    println(m)
    }



