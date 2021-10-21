                            /***** Q1 - Extensions..*****/

fun main() {
    val R = "azam abdullah"                     //testing repetitive extension
    println(R.RepetitiveChar())
    /*------------------------------------------------------------------------------*/
    val N = 562                                 //testing reverse extension
    N.NumInRev()
}
    /*------------------------------------------------------------------------------*/
                                            /***** Q1 Part I - repetitive.*****/
                            /***** - RepetativeChar()- extension that replace repetitive double characters.*****/

fun String.RepetitiveChar(): String {
    var RepCh = this
    RepCh.forEachIndexed() { index, a ->        //- forEachIndexed- function that takes the index of a character and the character itself and performs the action on the character.
        if (a == this[index])                   // her in -if- we check char by char to change the repetitive characters to -**- with function -.replace-
            RepCh = RepCh.replace("$a$a", "*")         //build in function make codding much easier (^-^)
    }
    return RepCh
}
    /*------------------------------------------------------------------------------*/
                            /***** Q1 Part 2 - reverse.*****/
fun Number.NumInRev() = println(this.toString().reversed())
                           /* in -.reversed- function we can't revers number it work only with string so in this function we first change
                            the numbers to string than revers it and print it*/
