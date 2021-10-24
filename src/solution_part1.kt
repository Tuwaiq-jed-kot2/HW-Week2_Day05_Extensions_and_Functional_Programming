fun main() { // part1-2
    val p = 123456
    p.reverse()
}

fun Any.reverse(){
    println(this.toString().reversed().toInt())

}
