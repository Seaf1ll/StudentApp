package Week_1

fun main () {
    val artists = arrayOf("Louis Cole", "Duran Duran", "ACE+", "Donna Burke")
    println("Guess one of my favourite artists.\n")
    var guess = readln()

    if (guess in artists) {
        println("Wow! You got it first try!")
    }

    else {
        while (guess !in artists) {
            println("Wrong guess! Try again.\n")
            guess = readln()
        }
        println("Hey, you got it!")
    }
}