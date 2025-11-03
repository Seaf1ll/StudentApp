package Week_1

fun main () {
    println("Enter your name:\n")
    val name = readln()
    print("How many times do you want your name displayed?\n")
    val t = readln().toInt()
    for (i in 1..t) {
        println(name)
    }
}