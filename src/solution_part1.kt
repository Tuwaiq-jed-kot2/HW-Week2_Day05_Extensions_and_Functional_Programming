
fun main() {

    //- Create an extension that replace repetative double characters in string (ex.: aa) to (**). ( optional )
    println("Enter a string")
    val userInput = readLine()
    println("User input string solution: ")
    userInput?.replaceRep()
    val str = "rajuuwssa isgg heffrppe"
    println()
    println("String solution: ")
    str.replaceRep()

    println()

    //- Create an extension that prints any number value in reverse order.
    println("Enter a number to reverse")
    val revNum = Integer.valueOf(readLine())
    print("Reversed number is: ")
    revNum.reverseNum()
}

fun String.replaceRep() {

    var x = 0
    while (x <= this.length - 1) {

        if (x == this.lastIndex) {
            println(this[x])
            break
        } else {
            if (this[x] == this[x + 1]) {

                val y = this.replace(this[x], '*')
                val z = this.replace(this[x + 1], '*')

                print(y[x])
                print(z[x])

                x += 2

            } else {
                print(this[x])
                x++
            }
        }
    }
}

fun Int.reverseNum() {

    println(this.toString().reversed())
}