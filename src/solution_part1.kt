import kotlin.coroutines.ContinuationInterceptor

//Create an extension that replace repetative double characters in string (ex.: aa) to (**).
fun main() {
   val name="maam"
    name.reblace("a")

}

fun String.reblace(name1: String) {
   println( name.reblace("*"))

}





// Create an extension that prints any number value in reverse order.
fun main() {
   val list = mutableListOf( 11,50,1)
   val revers= list.reversed()
   println(revers)
}
