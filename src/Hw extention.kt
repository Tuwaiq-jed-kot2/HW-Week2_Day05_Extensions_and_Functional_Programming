fun main() {
    var num = "12345"

    var theReverseOfNum = reverse(num)
    println(theReverseOfNum)
}
fun reverse(theReverseOfNum: String): String {
    var reverse = ""

    for (i in theReverseOfNum.length - 1 downTo 0) {
        reverse += theReverseOfNum[i]
    }

    return reverse
}

