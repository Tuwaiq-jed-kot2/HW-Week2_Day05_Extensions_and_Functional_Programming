# Kotlin Essentials (Extensions / Functional Programming Basics)
---
## Learning Objectives ✨
- How to create and deal with Extensions and Functional Programming Basics.

## Getting strated
Open the [assignment.md](assignment.md) file to get started.


//------Practice with Extensions.

fun  main() {
val ex :String = "Bashayr"
println(ex.student())
}
fun String.student (){
val ex = this
println (this.plus(" welcome to our collage"))
}


//------Practice with Functional Programming Basics.

fun main() {

    val passedStudent = listOf( 88 , 70, 43 ,55 , 56 ,99, 100);
    val listName = passedStudent.filter { it > 80 }
        .map {it.to("congratulations u pass !!")  }
    println(listName)

}