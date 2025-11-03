package Week_1

class Student (val id: String, val name: String, val course: String, val mark: Double) {
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

        println("Enter mark:\n")
        val mark = readln().toDouble()

        val student = Student(id, name, course, mark)
        println("Student recorded: $student\n")
        println("Did the student pass? ${student.didPass()}\n")
    }
}

