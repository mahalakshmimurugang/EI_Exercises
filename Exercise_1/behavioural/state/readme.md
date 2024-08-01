State Pattern
Overview
The State pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes. This pattern is close to the concept of finite-state machines.

Problem
In some cases, an object's behavior is dependent on its internal state, and it must change its behavior at runtime according to its state. This can lead to complex conditional statements and tight coupling between objects.

Solution
The State pattern solves this problem by:

Encapsulating the state of an object in a separate class.
Delegating the behavior of the object to the state class.
Allowing the object to change its state at runtime.