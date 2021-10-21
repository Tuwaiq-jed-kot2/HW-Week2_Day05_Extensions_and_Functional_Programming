fun main(){
    //----------------------------part1---------------------------------------
    println("Enter string to hide the double char")
    val str = readLine()
    println("the string without double char is ")
    if (str != null) {
        str.replaceRepetChar()
    }else
        println("not type any things")


 //-----------------------------------part2-----------------------------------
    try {
    println("Enter number you want to reversed")
    val num = readLine()?.toDouble()
    println("the number after reversed is")
    if (num != null) {
        println(num.reverseNumber())
        }
    }catch (e: NumberFormatException){
            println("you type number please")
        }

}



var Index = 0
fun String.replaceRepetChar(){
    if (Index < this.length-1) {
        if (this[Index] == this[Index + 1]) {
            val temp1 = this.replace(this[Index], '*')
            val temp2 = this.replace(this[Index + 1], '*')
            print(temp1[Index])
            print(temp2[Index])
            Index += 2
            replaceRepetChar()

        } else {
            print(this[Index])
            Index++
            replaceRepetChar()
        }
    }
}

fun Number.reverseNumber(): Double {
    return this.toString()
                    .reversed()
                        .toDouble()
}