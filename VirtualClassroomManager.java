import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


@SuppressWarnings("all")
public class VirtualClassroomManager{
    private Map<String, Classroom> classrooms;
    private Map<String, Student> students;
    private Map<String, Assignment> assignments;

    public VirtualClassroomManager(){
        this.classrooms = new HashMap<>();
        this.students = new HashMap<>();
        this.assignments = new HashMap<>();
    }
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Virtual Classroom Manager!");
        System.out.println("Here are the available commands:");
        System.out.println("  add_classroom <name>        : Add a new classroom with the given name");
        System.out.println("  add_student <id> <class>    : Add a new student with the given ID to the specified classroom");
        System.out.println("  schedule_assignment <class> <details> : Schedule a new assignment for the specified classroom");
        System.out.println("  submit_assignment <id> <class> <details> : Submit an assignment for the specified student in the specified classroom");
        System.out.println("  list_classrooms             : List all available classrooms");
        System.out.println("  list_students <class>       : List all students enrolled in the specified classroom");
        System.out.println("  exit                       : Exit the Virtual Classroom Manager");
        boolean commandCount = true;
        while (commandCount){
            System.out.print("Enter command: ");
            String command = sc.nextLine();
            String[] parts = command.split(" ");
            try{
                switch (parts[0]) {
                    case "add_classroom":
                        addClassroom(parts[1]);
                        break;
                    case "add_student":
                        addStudent(parts[1], parts[2]);
                        break;
                    case "schedule_assignment":
                        scheduleAssignment(parts[1], parts[2]);
                        break;
                    case "submit_assignment":
                        submitAssignment(parts[1], parts[2], parts[3]);
                        break;
                    case "list_classrooms":
                        listClassrooms(sc);
                        break;
                    case "list_students":
                        listStudents(parts[1]);
                        break;
                    case "exit":
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid command. Try again!");
                }
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid command format. Try again!");
            }catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
    private void addClassroom(String name) {
        try{
            Classroom classroom = new Classroom(name);
            classrooms.put(name, classroom);
            System.out.println("Classroom Addition: " + name + " has been created.");
        }
        catch (Exception e){
            System.out.println("Error creating classroom: " + e.getMessage());
        }
    }
    private void addStudent(String studentName, String className){
        Scanner sc = new Scanner(System.in);
            try{
                if (!classrooms.containsKey(className)){
                    System.out.println("Classroom " + className + " does not exist.");
                    System.out.print("Would you like to add a new classroom? (yes/no): ");
                    String reply = sc.nextLine().trim().toLowerCase();
                    if (reply.equals("yes")) {
                        addClassroom(className);
                    }
                    else{
                        System.out.println("Student addition cancelled.");
                        return;
                    }
                }
                Classroom classroom = classrooms.get(className);
                if (classroom.hasStudent(studentName)){
                    System.out.println("Student with name " + studentName + " is already enrolled in " + className + ".");
                    return;
                }
                Student student = new Student(studentName, className);
                classroom.addStudent(student);
                students.put(studentName, student);
                System.out.println("Student Addition: " + studentName + " has been enrolled in " + className + ".");
            }
            catch(Exception e){
                System.out.println("Error adding student: " + e.getMessage());
            }
        }

    public boolean hasStudent(String studentName){
        for (Student student : this.getStudents()){
            if (student.getId().equals(studentName)){
                return true;
            }
        }
        return false;
    }
    private void scheduleAssignment(String className, String assignmentDetails){
        Scanner sc = new Scanner(System.in);
        try{
            if (!classrooms.containsKey(className)){
                System.out.println("Classroom " + className + " does not exist.");
                System.out.print("Would you like to add a new classroom? (yes/no): ");
                String reply = sc.nextLine().trim().toLowerCase();
                if (reply.equals("yes")) {
                    addClassroom(className);
                }
                else{
                    System.out.println("Assignment scheduling cancelled.");
                    return;
                }
            }
            Classroom classroom = classrooms.get(className);
            if (classroom.getStudents().isEmpty()){
                System.out.println("Classroom " + className + " has no students. Cannot schedule assignment.");
                return;
            }
            Assignment assignment = new Assignment(assignmentDetails);
            classroom.addAssignment(assignment);
            System.out.println("Assignment Scheduled:  " + className + " has been scheduled.");
        }
        catch (Exception e){
            System.out.println("Error scheduling assignment: " + e.getMessage());
        }
    }

    private void submitAssignment(String studentId, String className, String assignmentDetails){
        try{
            if (!students.containsKey(studentId) || !classrooms.containsKey(className)){
                System.out.println("Student or classroom does not exist.");
                return;
            }
            Student student = students.get(studentId);
            Classroom classroom = classrooms.get(className);
            if (!classroom.getStudents().contains(student)) {
                System.out.println("Student is not enrolled in this classroom.");
                return;
            }
            Assignment assignment = classroom.getAssignment(assignmentDetails);
            if (assignment == null){
                System.out.println("Assignment does not exist.");
                return;
            }
            student.submitAssignment(assignment);
            System.out.println("Assignment Submission: Assignment submitted by Student " + studentId + " in " + className + ".");
        }
        catch (Exception e){
            System.out.println("Error submitting assignment: " + e.getMessage());
        }
    }

    private void listClassrooms(Scanner sc){
        try{
            if (classrooms.isEmpty()){
                System.out.println("No classrooms available.");
                System.out.print("Would you like to add a new classroom? (yes/no): ");
                String reply = sc.nextLine();
                if (reply.equalsIgnoreCase("yes")) {
                    System.out.print("Enter classroom name: ");
                    String name = sc.nextLine();
                    addClassroom(name);
                }
            }
            else{
                System.out.println("Classrooms:");
                for (Classroom classroom : classrooms.values()) {
                    System.out.println(classroom.getName());
                }
            }
        }
        catch (Exception e){
            System.out.println("Error listing classrooms: " + e.getMessage());
        }
    }
    private void listStudents(String className){
        Scanner sc = new Scanner(System.in);
        try{
            if (!classrooms.containsKey(className)){
                System.out.println("Classroom " + className + " does not exist.");
                System.out.print("Would you like to add a new classroom? (yes/no): ");
                String reply = sc.nextLine().trim().toLowerCase();
                if (reply.equals("yes")) {
                    addClassroom(className);
                }
                else{
                    System.out.println("Assignment scheduling cancelled.");
                    return;
                }
            }
            Classroom classroom = classrooms.get(className);
            if (classroom.getStudents().isEmpty()){
                System.out.println("No students enrolled in " + className + ".");
                System.out.print("Would you like to add a new student? (yes/no): ");
                String reply = sc.nextLine();
                if (reply.equalsIgnoreCase("yes")) {
                    System.out.print("Enter student ID: ");
                    String studentId = sc.nextLine();
                    addStudent(studentId, className);
                }
            }
            else{
                System.out.println("Students in " + className + ":");
                for (Student student : classroom.getStudents()) {
                    System.out.println(student.getId());
                }
            }
        }
        catch(Exception e){
            System.out.println("Error listing students: " + e.getMessage());
        }
    }

    public static void main(String[] args){
        VirtualClassroomManager manager = new VirtualClassroomManager();
        manager.run();
    }
}

class Classroom{
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addAssignment(Assignment assignment){
        assignments.add(assignment);
    }

    public Assignment getAssignment(String details){
        for (Assignment assignment : assignments) {
            if (assignment.getDetails().equals(details)){
                return assignment;
            }
        }
        return null;
    }

    public boolean hasStudent(String studentName){
        for (Student student : students){
            if (student.getId().equals(studentName)){
                return true;
            }
        }
        return false;
    }
}

class Student{
    private String id;
    private List<Assignment> submittedAssignments;
    @SuppressWarnings("unused")
    private String className;

    public Student(String id, String className){
        this.id = id;
        this.className = className;
        this.submittedAssignments = new ArrayList<>();
    }

    public String getId(){
        return id;
    }

    public void submitAssignment(Assignment assignment){
        submittedAssignments.add(assignment);
    }

    public List<Assignment> getSubmittedAssignments(){
        return submittedAssignments;
    }
}

class Assignment{
    private String details;

    public Assignment(String details){
        this.details = details;
    }

    public String getDetails(){
        return details;
    }
}