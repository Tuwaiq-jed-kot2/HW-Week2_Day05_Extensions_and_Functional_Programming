fun main() {
    //crete double
    val doubleRev=65.95
        doubleRev.extensionAny()
    //crete int
    val intRev=87
    intRev.extensionAny()
    //crete float
    val  floatRev=45.4563F
        floatRev.extensionAny()

}

fun Any.extensionAny(){
    println(this.toString().reversed())
}