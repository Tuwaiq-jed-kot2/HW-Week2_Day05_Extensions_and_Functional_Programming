fun main() {

    val numbersList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    Int.reverseOrd(numbersList)

    val numbers = 123456789
    println(reverseNumber(numbers))

}

fun Int.Companion.reverseOrd(num: List<Int>) {
    println(num.reversed())
}

fun reverseNumber(number: Int): Int {
    return number.toString().reversed().toInt()
}

