VIRTUAL CLASSROOM MANAGER Overview The Virtual Classroom Manager is a comprehensive, terminal-based application designed to streamline the management of virtual classrooms. With its intuitive interface and robust features, educators can effortlessly create and manage virtual classrooms, enroll students, schedule assignments, and track progress.

Features Classroom Management: Create, remove, and list virtual classrooms with ease.

Student Enrollment: Enroll students in specific classrooms and manage their assignments.

Assignment Scheduling: Schedule assignments for students in a particular classroom.

Assignment Submission: Allow students to submit assignments and track their completion status.

Classroom Details: View detailed information about each classroom, including enrolled students, scheduled assignments, and submission status.

Design Patterns and Principles Singleton Pattern: Ensures a single instance of the ClassroomManager class, promoting efficient resource management. Factory Pattern: Utilized for creating instances of Student and Assignment classes, enabling flexible object creation. Command Pattern: Implemented in the Main class to handle user commands, providing a scalable and maintainable architecture. Usage The following commands are available in the Virtual Classroom Manager:

Classroom Management add_classroom <class_name>: Create a new virtual classroom.

list_classrooms: List all available virtual classrooms.

Student Enrollment add_Student <student_id> <class_name>: Enroll a student in a specific classroom.

Assignment Management schedule_assignment <class_name> <assignment_name>: Schedule an assignment for a particular classroom.

submit_assignment <student_id> <class_name> <assignment_name>: Submit an assignment on behalf of a student.

Viewing Classroom Details list_students <class_name>: List all students enrolled in a specific classroom.

list_classrooms : Lists all the classrooms.

exit: Quit the Virtual Classroom Manager application. Compilation and Execution Prerequisites Java Development Kit (JDK) 8 or later.
