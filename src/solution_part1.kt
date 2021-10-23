/*---------------------------------Part II------------------------------------------*/
/*--------------------------------Answer Q1 -----------------------------------------*/
fun main() {
    val word:String
    word = "Saeed"
    print( word.replaceRepetative())
}

fun String.replaceRepetative(): String {
    val changingTheDouble = "(\\w)\\1+".toRegex()
    var newChar = this.replace(changingTheDouble, "**")

    return newChar
}
/*--------------------------------Answer Q2 -----------------------------------------*/
//fun main() {
//    q@ while (true)
//        try {
//            print("Enter Integer numbers more than single number:")
//            val x: Int = readLine()!!.toInt()
//            if(x in -9..9){
//                println("pleas enter numbers more the single number")
//                continue@q}
//            else x.reverseNumbers()
//            break@q
//        } catch (e: NumberFormatException) {
//            println("pleas enter integer numbers")
//            continue@q
//        }
//    println("Done")
//}
//
//fun Int.reverseNumbers() {
//    println("The reverse numbers is : ${this.toString().reversed()}")
//}
