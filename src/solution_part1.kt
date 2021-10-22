fun main() {
    var number =9876543
    number.reversNum()

}
fun Int.reversNum(){
    println(this.toString().reversed().toInt())

}