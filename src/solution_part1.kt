
fun main() {

val number = 345
    number.rev()
}

fun Int.rev() {
    println(this.toString().reversed().toInt())
}

