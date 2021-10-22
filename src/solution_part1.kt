/*
first extension function reverse int number 1234 > 4321
optional part i tried to solve it with regex but there are some problems
the regex only works with the letter written in the regex pattern

*/
fun main() {

    val n1 = 1234
    println(n1.reverse())


    val w1 = "abcddefghhidhdgdd"
    println(w1.repeatedLetters())
}

fun Int.reverse(): Int {

    return this.toString().reversed().toInt()
}

fun String.repeatedLetters(): String {
    val reg = Regex(pattern = "dd+")
    var str = this.replace(reg, "**")
    return str
}