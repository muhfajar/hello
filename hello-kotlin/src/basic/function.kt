package basic

// Defining functions https://kotlinlang.org/docs/reference/basic-syntax.html#defining-functions

// function have 2 int parameter and return as int
fun sum(a: Int, b:Int): Int {
    return a + b
}

// inline function
fun sumInline(a: Int, b: Int) = a + b

// no meaningful return, as default function return as Unit, so code `: Unit` can be removed
fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun main(args: Array<String>) {
    // 1
    print("Sum of 3 and 5 is ")
    println(sum(3, 5))
    // 2
    println("Sum of 19 and 9 is ${sumInline(19, 9)}")
    // 3
    printSum(7, 2)
}