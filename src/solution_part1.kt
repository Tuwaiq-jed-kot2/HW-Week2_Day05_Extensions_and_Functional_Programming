/*---------------------------------Part II------------------------------------------*/
/*--------------------------------Answer Q1 -----------------------------------------*/
//fun main() {
//    val word:String
//    word = "mohammed"
//    print( word.removeDublChar())
//}
//
//fun String.removeDublChar() {
//    val builder = StringBuilder()
//    var i = 0
//    while (i < builder.length) {
//        var foundCount = 0
//        for (j in i - 1 downTo 0) {
//            if ((builder[i]) == (builder[j])) {
//                foundCount++
//            } else {
//                break
//            }
//        }
//        i++
//    }
//}

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
