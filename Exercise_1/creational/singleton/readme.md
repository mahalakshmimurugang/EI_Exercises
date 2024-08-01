Overview
The Singleton pattern is a creational design pattern that restricts a class from instantiating multiple objects. It creates a single instance of a class and provides a global point of access to that instance.

Problem
In some cases, you may want to control the instantiation of a class to ensure that only one instance is created. This can be useful when:

You want to manage a resource that should have a single point of control.
You want to provide a global point of access to a resource.
You want to reduce the overhead of creating multiple instances of a class.

Solution
The Singleton pattern solves this problem by:

Restricting the instantiation of a class to a single instance.
Providing a global point of access to that instance.