package Week_1

abstract class Student (val id: String, val name: String, val course: String) {
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
    abstract fun getGrade(): String
}
class Undergraduate(id: String, name: String, course: String) : Student(id, name, course) {
    override fun getGrade(): String {
        return when (mark.toInt()) {
            in 70..100 -> "First"
            in 60..69 -> "2/1"
            in 50..59 -> "2/2"
            in 40..49 -> "Third"
            in 0..39 -> "Fail"
            else -> "Error - invalid percentage"
        }
    }
}

class Masters(id: String, name: String, course: String) : Student(id, name, course) {
    override fun getGrade(): String {
        return when (mark.toInt()) {
            in 70..100 -> "Distinction"
            in 60..69 -> "Merit"
            in 40..59 -> "Pass"
            in 0..39 -> "Fail"
            else -> "Error - invalid percentage"
        }
    }
}
fun main() {
    while (true) {
        println("Enter student type (undergraduate/masters) or 'quit' to exit:")
        val type = readln()
        if (type == "quit") break

        println("Enter student name:")
        val name = readln()

        println("Enter student ID:")
        val id = readln()

        println("Enter course:")
        val course = readln()

        val student: Student = when (type) {
            "undergraduate" -> Undergraduate(id, name, course)
            "masters" -> Masters(id, name, course)
            else -> {
                println("Invalid student type")
                continue
            }
        }

        println("Enter mark for ${student.name}:")
        val markInput = readln().toDouble()
        student.mark = markInput
        println("Student recorded: $student")
        println("Did the student pass? ${student.didPass()}")
        println("Grade: ${student.getGrade()}\n")
    }
}