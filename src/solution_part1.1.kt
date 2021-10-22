fun main() {
    val name = "wwImwwNotwwRobotww"
   println( name.replaceRepetitive())
}

fun String.replaceRepetitive(){
    var i = 0
    /*while the i that represent the pointer on the loop less than or equal the string length -1
    because the indexes always star with 0 but the length starts with 1 so if we supposed that
    the string length is 5 the i  should be in range 0..4, if we leave it without adding the
    (-1) to the string length we will get out of boundaries exception */
    while (i <= this.length-1) {
        // if the i is the string last index, print index i and break the loop
        if (i == this.lastIndex) {
            print(this[i])
            break
        } else {
            //if the i index has the same char as the next index (i+1)
            if (this[i] == this[i+1]) {
                //replace i and i+1 and print the replacement value which is *
                val r1 = this.replace(this[i], '*')
                val r2 = this.replace(this[i+1], '*')
                print(r1[i])
                print(r2[i+1])
                //go to the next index after the i+1
                i += 2
            } else {
                // if it doesn't fulfill the previous conditions print the index i and continue
                print(this[i])
                i++
            }
        }
    }
}