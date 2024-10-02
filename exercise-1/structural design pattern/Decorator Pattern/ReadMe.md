Definition:
The Decorator Pattern allows behavior to be added to an individual object, either statically or dynamically, without affecting the behavior of other objects from the same class. It provides an alternative to subclassing for extending functionality.

Scenario:
In a coffee shop, customers can order a basic coffee and choose to add extra ingredients like milk or sugar. The Decorator Pattern enables this by allowing the core coffee object to be "decorated" with additional features (like milk or sugar) without modifying the base class.

Key Components:
Component (Coffee Interface):

Declares the common interface (methods) for all components, like getDescription() and cost().
Concrete Component (BasicCoffee Class):

Represents the core object, in this case, a simple coffee, which implements the Coffee interface.
Decorator (Abstract Decorator Class):

The abstract decorator class (like MilkDecorator) implements the Coffee interface and has an instance of the component it decorates.
Concrete Decorators (MilkDecorator Class):

Decorators like MilkDecorator are concrete classes that wrap the original object and provide new functionalities by overriding methods like getDescription() and cost().
Advantages:
Open-Closed Principle: The decorator pattern adheres to the open-closed principle by allowing new functionality to be added without modifying the existing code.
Flexible Extension: It allows for adding any number of combinations of functionalities to an object dynamically.
Reusable Decorators: Each decorator can be applied to any object of the base component type, making the system more flexible and reusable.
Implementation Overview:
In this coffee shop scenario, the BasicCoffee class provides the basic coffee. The MilkDecorator class decorates the basic coffee by adding milk functionality, thus extending the coffee’s description and cost.