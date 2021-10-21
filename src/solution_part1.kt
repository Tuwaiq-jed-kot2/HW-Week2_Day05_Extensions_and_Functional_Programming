//----------------------first part---------------------

fun Int.reveres(){


    var numberReversed = 0
    var firstDigit = 0

    var num = this

    while (num  != 0 ){
        firstDigit = num % 10
        numberReversed = numberReversed * 10 + firstDigit
        num /= 10
    }
    print("you number reversed is: ")
    println(numberReversed)
}




fun main() {

    try {


        print("Please enter the number you want to reverse: ")
        val number = readLine()?.toInt()

        number?.reveres()
    }catch (e: NumberFormatException){
        println("you typed letters please re run the program and type numbers only")
    }

//----------------------optional part---------------------

    println("please type the sentence that you want the repeated letters that you want to be changed: ")

    var word = readLine()
        word?.repeatedReplacer()


}


fun String.repeatedReplacer (){

    var temporary = this
    println(temporary)
    var y = 0
    while (y < this.length-1){
        var reapeted = ""
        var reapeted2 = ""
        if (this[y] == this[y+1]){
            reapeted += this[y]
            reapeted2 += this[y+1]
            temporary = temporary.replace(reapeted,"*")
            temporary = temporary.replace(reapeted2,"*")
        }
        y++
    }


    println(temporary)
}
