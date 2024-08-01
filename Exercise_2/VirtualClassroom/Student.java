package VirtualClassroom;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private List<Assignment> submittedAssignments;
    @SuppressWarnings("unused")
    private String className;

    public Student(String id, String className) {
        this.id = id;
        this.className = className;
        this.submittedAssignments = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void submitAssignment(Assignment assignment) {
        submittedAssignments.add(assignment);
    }

    public List<Assignment> getSubmittedAssignments() {
        return submittedAssignments;
    }
}
