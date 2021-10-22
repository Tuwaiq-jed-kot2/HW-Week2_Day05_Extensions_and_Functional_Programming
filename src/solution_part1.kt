fun main() {
   val x = listOf(2, 4, 6 ,8)
   val n = listOf(1,3, 5 ,7)

   val result =x.filter { it>4 }
                    .map { it*2 }
                       .flatMap {n+it}



             println(result)

}

