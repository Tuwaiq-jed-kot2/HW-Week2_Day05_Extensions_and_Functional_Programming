import java.lang.NumberFormatException

fun main() {
    val n=partv2()
    val b=part()

}




 fun part(){
    //  Create an extension that prints any number value in reverse order.
    try {

        println("Enter in number amd the program well reverse it")
        val v = readLine()?.toInt()
        v.PrintsAnyNumberInReverseOrder()
    }catch (e: NumberFormatException){
        println("the program ic crashed!!,\n you did some thing wrong")
    }
}


fun Int?.PrintsAnyNumberInReverseOrder(): Int? {
    var x=this
    println(x.toString().reversed().toInt())
    return x
}
















fun partv2 (){
    //  Create an extension that replace repetative double characters in string (ex.: aa) to (**). ( optional )
    try {
        println("Write any thing you want, but  you can't write 2 characters repetative double character ")
        val h= readLine()


        h?.replaceRepetativeDoubleCharacters()
    }catch (e:Exception){
        println("the program ic crashed!!,\n you did some thing wrong")

    }



}
// this function
fun String.replaceRepetativeDoubleCharacters(): String {
       var e = this.toLowerCase()
        this.forEachIndexed() { index, f ->

        if (f == this[index])


            e = e.replace("$f$f", "**")
    }

    println(e)
         return e

}
//}