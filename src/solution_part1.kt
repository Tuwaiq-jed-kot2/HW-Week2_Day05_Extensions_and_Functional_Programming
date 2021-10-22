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
fun main(args: Array<String>) {
    var xx = arrayOf("a","aa","aaa","aaaa")
    val re = Regex("a(a+)")
    xx.forEach {t->
        val result = re.replace(t,"**")
        println(result)
    }
}