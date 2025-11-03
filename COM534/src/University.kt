class University {
    private val students = mutableListOf<Student>()

    fun enrolStudent(student: Student) {
        students.add(student)
        println("${student.name} has been enrolled.")
    }
    fun SearchStudentID(id: String): Student? {
        return students.find { it.id == id }
    }
    fun SearchStudentsName(name: String): MutableList<Student> {
        val transfers = mutableListOf<Student>()
        for (s in students) {
            if (s.name.equals(name, ignoreCase = true)) {
                transfers.add(s) }
        }
        return transfers
    }
}