

fun main() {


    //Q1

       println("Please, enter your data: ")
       val n = readLine()
       n?.replacing()




    //Q2
    println("Please enter the number you want to reverse it:")
    try {
        val x = readLine()?.toInt()
        x?.reverseNumber()

    }catch (e: NumberFormatException){
        println("Numbers only")
    }


}
//Q1

fun String.replacing(){
    val x = "a+a|b+b|c+c|d+d|e+e|f+f|g+g|h+h|i+i|j+j|k+k|l+l|m+m|n+n|o+o|p+p|q+q|r+r|s+s|t+t|u+u|v+v|x+x|y+y|z+z".toRegex()
    println(this.lowercase().replace(x,"**"))
}



//Q2

fun Int.reverseNumber(){
    println(this.toString().reversed())
}


