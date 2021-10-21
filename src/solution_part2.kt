                                            /***** Q2 Part 1 solution.*****/
fun main() {
val HW = mutableListOf("HomeWork1" , "HomeWork2" , "HomeWork3" , "HomeWork4")        //map functional chains
val G = HW
    .map { HW -> "good job $HW complete"}        //Someone I know correcting homework like this (^-^)
println(G)
/*------------------------------------------------------------------------------*/
val CarOfDifferentColor = mutableListOf(                                    //I use 2 functional chains here flatMap and filter
    mutableListOf( "blue camaro" , "red camry" , "yellow corolla"),
    mutableListOf("black santafee" , "green sonata" , "blue rang rover"),     //here we define mutableList and inside it another 3 mutableList, so we can use
    mutableListOf("White elntra" , "blue prado" , "yellow mustang")                                   //flatMap
)
val BlueCars = CarOfDifferentColor.flatMap { ColorList -> ColorList.filter { color ->    //-flatMap- combine the 3 list to one list, and we filter it by the color
    color.contains("blue") } }                                                          // with -filter- function and print the blue cars only
                                                               //all information about -flatMap- in Kotlin Programming - The Big Nerd Ranch Guide book page (295)
 println(BlueCars)

  /*------------------------------------------------------------------------------*/
                                    /***** Q2 Part 2 solution.*****/

val valuesToAdd = mutableListOf(1, 18, 73, 3, 44, 6, 13, 33, 2, 22, 5, 7, 32, 3, 9, 8, 24)
var FinalNumber = 0
                val Result = valuesToAdd.filter { it > 7 }  //Exclude any number less than 7 using -filter-.
                    .map { it * 2 }                         //Multiply each number by 2 using map.
                    .forEach {
                        FinalNumber += it                   //store the Sum result to the - FinalNumber - variable
                    }

println(FinalNumber)
}
