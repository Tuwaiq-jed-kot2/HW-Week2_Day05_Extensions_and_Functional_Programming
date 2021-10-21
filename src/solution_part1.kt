fun main() {
    val x = 123
    x.reverese()

}


fun Int.reverese(){


    var revereseNum = 0

    var num = this

    while (num  != 0 ){
        val remainder = num % 10
        revereseNum = revereseNum * 10 + remainder
        num /= 10
    }
    println(revereseNum)
}

