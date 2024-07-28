exercise 1:
Bridge Pattern

The Bridge pattern is a structural design pattern that separates an abstraction from its implementation, allowing them to vary independently. It decouples an object's abstraction from its implementation, making it possible to change the implementation without affecting the abstraction.

Use Cases:

Drawing Application: The Bridge pattern is used to separate the shape abstraction from its implementation, allowing for more flexibility and extensibility in a drawing application.
Virtual Classroom Manager: The Bridge pattern is used to separate the classroom abstraction from its implementation, allowing for more flexibility and extensibility in a virtual classroom manager.
Behavioral Design Patterns:

1. Observer Pattern

The Observer pattern is a behavioral design pattern that defines a one-to-many dependency between objects, allowing objects to notify each other of changes.

Use Case:

Weather Station: The Observer pattern is used to notify multiple displays of weather data when the data changes.
2. Strategy Pattern

The Strategy pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable.

Use Case:

Payment Gateway: The Strategy pattern is used to select a payment strategy (e.g., credit card, PayPal) at runtime, allowing for more flexibility and extensibility in a payment gateway.

exercise 2: 

Virtual Classroom Manager
This is a Java implementation of a terminal-based Virtual Classroom Manager that handles class scheduling, student attendance, and assignment submissions.

Use Case
The use case for this example is an EdTech platform that aims to host virtual classrooms. The Virtual Classroom Manager allows administrators to create classrooms, add students, schedule assignments, and track student submissions.

Classes
VirtualClassroomManager: Main class that manages the virtual classroom.
Classroom: Represents a virtual classroom.
Student: Represents a student enrolled in a classroom.
Assignment: Represents an assignment scheduled for a classroom.
How to Run
Compile the Java classes using javac.
Run the VirtualClassroomManager class using java.
Follow the prompts to create classrooms, add students, schedule assignments, and track student submissions.
Commands
add_classroom <name>: Add a new classroom with the given name.
add_student <id> <class>: Add a new student with the given ID to the specified classroom.
schedule_assignment <class> <details>: Schedule a new assignment for the specified classroom.
submit_assignment <id> <class> <details>: Submit an assignment for the specified student in the specified classroom.
list_classrooms: List all available classrooms.
list_students <class>: List all students enrolled in the specified classroom.
exit: Exit the Virtual Classroom Manager.
