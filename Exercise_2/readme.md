VIRTUAL CLASSROOM MANAGER Overview The Virtual Classroom Manager is a comprehensive, terminal-based application designed to streamline the management of virtual classrooms. With its intuitive interface and robust features, educators can effortlessly create and manage virtual classrooms, enroll students, schedule assignments, and track progress.

Features Classroom Management: Create, remove, and list virtual classrooms with ease.

Listing all the commands:
![image](https://github.com/user-attachments/assets/426dfeaf-d61c-4a68-8a61-d323471e99bb)


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

Some inputs and outputs:
![image](https://github.com/user-attachments/assets/3428a9cc-52c6-42c0-a4bd-07cadec82fd0)

list_students without students in class - >
![image](https://github.com/user-attachments/assets/e267b25a-2c8b-43b6-ad5c-a037723ad9a7)

adding an existing student name in the same class->
![image](https://github.com/user-attachments/assets/44376278-0bc6-44b8-83d0-ade2afbf782d)

listing classrooms when no classrooms are available - >
![image](https://github.com/user-attachments/assets/5e361bfb-fd30-4b01-973a-efd4b3f278a2)

Scheduling assignments when the class has no students - >
![image](https://github.com/user-attachments/assets/f628e326-4536-4c93-a0ce-dcf24f6fcf15)






Viewing Classroom Details list_students <class_name>: List all students enrolled in a specific classroom.

list_classrooms : Lists all the classrooms.

exit: Quit the Virtual Classroom Manager application. Compilation and Execution Prerequisites Java Development Kit (JDK) 8 or later.
