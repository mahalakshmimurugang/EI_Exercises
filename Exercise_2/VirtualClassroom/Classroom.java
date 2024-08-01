package VirtualClassroom;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public Assignment getAssignment(String details) {
        for (Assignment assignment : assignments) {
            if (assignment.getDetails().equals(details)) {
                return assignment;
            }
        }
        return null;
    }

    public boolean hasStudent(String studentName) {
        for (Student student : students) {
            if (student.getId().equals(studentName)) {
                return true;
            }
        }
        return false;
    }
}
