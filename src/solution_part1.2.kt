fun main() {
    // the extension function with integer numbers
    val int1 = 123456789
    int1.reverseOrder()
    // the extension function with double numbers
    val double1 = 12.34
    double1.reverseOrder()
    // the extension function with float numbers
    val float1 = 56.78f
    float1.reverseOrder()
}

// create the extension function with the class Number, so we can use the function in all numbers data type
fun Number.reverseOrder(){
    // convert the number to string then use the reversed function
    println(this.toString().reversed())
}