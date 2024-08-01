Strategy Behavioral Pattern: Payment Strategy
Overview
The Strategy pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern lets the algorithm vary independently from clients that use it.

Problem
Imagine you're building an e-commerce platform that needs to support different payment methods, such as credit cards, PayPal, and bank transfers. You want to decouple the payment logic from the shopping cart class, so you can easily add or remove payment methods without modifying the cart class.

Solution
The Strategy pattern provides a solution by:

Defining a family of algorithms (payment strategies) that can be used interchangeably.
Encapsulating each algorithm in a separate class.
Providing a way to switch between algorithms at runtime.