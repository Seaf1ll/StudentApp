package Week_1

class Student (val id: String, val name: String, val course: String) {
    var mark: Double = 0.0
        set(value) {
            if (value in 0.0..100.0) {
                field = value
            } else {
                println("Mark must be between 0 and 100.")
            }
        }

    override fun toString(): String {
        return "Name: $name | Course: $course | Mark: $mark"
    }


    fun didPass(): Boolean {
        return mark >= 40
    }
}
fun main() {
    while (true) {
        println("Enter student name (or type 'quit' to exit):\n")
        val name = readln()
        if (name.lowercase() == "quit") {
            println("Exiting program...")
            break }

        println("Enter student ID:\n")
        val id = readln()

        println("Enter course:\n")
        val course = readln()

        val student = Student(id, name, course)
        println("Enter mark for ${student.name}:")
        val markInput = readln().toDouble()
        student.mark = markInput

        println("Student recorded: $student\n")
        println("Did the student pass? ${student.didPass()}\n")
    }
}

