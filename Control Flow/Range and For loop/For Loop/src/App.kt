// main function
fun main() {
    val ranges = 1..5

    for (i in ranges){
        println("value is $i!")
    }

    fizzBuzz()
}

fun fizzBuzz(): Unit {
    println("""
        
        Loop FIZZBUZZ
        
    """.trimIndent())
    for (i in 1.rangeTo(100)) {
        if (i % 3 == 0 && i % 5 ==0) {
            println("FizzBuzz")
        }
        else if (i % 3 == 0) {
            println("Fizz")
        }
        else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}