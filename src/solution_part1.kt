

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
    val x = "aa|bb|cc|dd|ee|ff|gg|hh|ii|jj|kk|ll|mm|nn|oo|pp|qq|rr|ss|tt|uu|vv|xx|yy|zz".toRegex()
    println(this.lowercase().replace(x,"**"))
}



//Q2

fun Int.reverseNumber(){
    println(this.toString().reversed())
}


