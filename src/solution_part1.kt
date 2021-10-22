// Part I - Extensions.

fun  main() {
    val list  = 6544
    list.student ()
}

fun Int.student() {
    val list = this.toString()
    println(list.reversed())

}

// حل البونس
//Create an extension that replace repetative double characters in string (ex.: aa) to (**).
fun main() {
    val company = "Mobily"
    val x = company.replace("i"+"l", "*"+"*")
    println(x)
}