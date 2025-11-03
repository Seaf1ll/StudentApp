fun main() {
    val uni = University()
    var choice: String

    while (true) {
        println(
            """
                -University Menu-
            1. Add a student
            2. Search for student by ID
            3. Search for students by name
            4. Quit
            Enter option:
            """
        )
        choice = readln()
        when (choice) {
            "1" -> {
                println("Enter student type (undergraduate/masters):")
                val type = readln()
                if (type != "undergraduate" && type != "masters") {
                    println("Error. $type is not valid")
                    continue
                }
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
                        println("Invalid student type.\n")
                        continue
                    }
                }
                println("Enter mark achieved by $name:")
                student.mark = readln().toDouble()

                uni.enrolStudent(student)
                println()
            }
            "2" -> {
                println("Enter student ID:")
                val id = readln()
                val student = uni.SearchStudentID(id)
                if (student != null) {
                    println("Found student: $student\n")
                } else {
                    println("ID not found\n")
                }
            }
            "3" -> {
                println("Enter student name:")
                val name = readln()
                val results = uni.SearchStudentsName(name)
                if (results.isEmpty()) {
                    println("No students found with name $name\n")
                } else {
                    println("Students found:")
                    results.forEach { println(it) }
                    println()
                }
            }
            "4" -> {
                println("Ending Program...")
                break
            }
            else -> println("Invalid option.\n")
        }
    }
}