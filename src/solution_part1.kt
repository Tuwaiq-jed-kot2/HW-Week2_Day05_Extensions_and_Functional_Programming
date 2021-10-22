fun main (){


 var number = 14675327
    println(number)
    println(number.reverseNum())

}


   fun Int.reverseNum():Int{
       return this.toString().reversed().toInt()

   }




