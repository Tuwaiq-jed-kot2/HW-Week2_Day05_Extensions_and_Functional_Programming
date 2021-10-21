//## Part I - Extensions.
//---
// 1- Create an extension that replace repetative double characters in string (ex.: aa) to (**).
// 2- Create an extension that prints any number value in reverse order.

fun main() {

    //Question 1
    val str = "Mohammed"
    println(str)
    println(str.replaceRepetative())
    println()

    //Question 2
    val firstQuestion = 12345
    val result = firstQuestion.reverse()
    println(result)
}

//Question 1
fun String.replaceRepetative(): String{
    var temp = ""
    var index = 0
        while (index < this.length-1){
            if (this[index] == this[index+1]){
                temp += this[index]
            }
            index++
        }
    val newStr = this.replace(temp,"*")
    return newStr
}

//Question 2
fun Int.reverse(): Int{
    return this.toString().reversed().toInt()
}