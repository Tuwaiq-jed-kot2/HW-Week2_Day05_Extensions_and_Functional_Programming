/*---------------------------------Part II------------------------------------------*/
/*--------------------------------Answer Q1 -----------------------------------------*/
//fun main() {
//    val word:String="mohammed"
//    word.replaceRepetitive()
//}
//fun String.replaceRepetitive() {
//    var i = 0
//    while (i <= this.length -1) {
//        if (this[i] == this[i + 1]) {
//            val char1 = this.replace(this[i], '*')
//            val char2 = this.replace(this[i + 1], '*')
//            print(char1[i])
//            print(char2[i + 1])
//            i += 2
//        } else {
//            print(this[i])
//            i++
//        }
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
