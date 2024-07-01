package design_patterns;

import design_patterns.creational.CreationalApp;
import design_patterns.structural.StructuralApp;
import design_patterns.behavioral.BehavioralApp;

public class DesignPatternApp {
    public static void main(String[] args) {
        System.out.println("Design Patterns Overview");
        System.out.println("============================");

        System.out.println("Creational Design Patterns");
        // Object creation mechanisms, which increase flexibility and reuse of existing code.

        // 1. Singleton Pattern
        // Ensures a class has only one instance and provides a global point of access to it.
        // CreationalApp.singletonDemo();

        // 2. Factory Method
        // Defines an interface for creating an object but lets subclasses alter the of objects that will be created.
        // CreationalApp.factoryMethodDemo();

        // 3. Abstract Factory
        // Provides an interface for creating families of related or dependent objects without specifying their
        // concrete classes. In other words, this model allows us to create objects that follow a general pattern.
        // CreationalApp.abstractFactory();

        // 4. Builder
        // Separates the construction of a complex object from its representation, allowing the same construction
        // process to create different representations.
        // Lombok also @Builder annotation that is specifically designed to address the Builder design pattern.
        // CreationalApp.builder();

        // 5. Prototype
        // Creates new objects by copying an existing object, known as the prototype.
        // CreationalApp.prototype();


        System.out.println("Structural Design Patterns");
        // Object composition or the organization of classes and objects.

        // 1. Adapter
        // Allows incompatible interfaces to work together by converting the interface of a class into another
        // interface clients expect.
        // StructuralApp.adapter();

        // 2. Bridge
        // Separates an object's abstraction from its implementation, allowing them to vary independently.
        // StructuralApp.bridge();

        // 3. Composite
        // Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat
        // individual objects and compositions uniformly.
        // StructuralApp.composite();

        // 4. Decorator
        // Adds additional responsibilities to an object dynamically, providing a flexible alternative to
        // subclassing for extending functionality.
        // StructuralApp.decorator();

        // 5. Facade
        // Provides a simplified interface to a complex subsystem.
        // StructuralApp.facade();

        // 6. Flyweight
        // Reduces the cost of creating and managing a large number of similar objects by sharing objects that
        // are identical.
        // StructuralApp.flyweight();

        // 7. Proxy
        // Provides a surrogate or placeholder for another object to control access to it.
        // StructuralApp.proxy();


        System.out.println("Behavioral Design Patterns");
        // Concerned with algorithms and the assignment of responsibilities between objects.

        // 1. Chain of Responsibility
        // Passes a request along a chain of handlers, where each handler decides either to process the request or
        // to pass it on to the next handler in the chain.
        // BehavioralApp.chainOfResponsibility();

        // 2. Command
        // Encapsulates a request as an object, thereby allowing for parameterization of clients with different
        // requests, queueing of requests, and logging of requests.
        // BehavioralApp.command();

        // 3. Interpreter
        // Defines a grammar for a language and an interpreter to interpret the grammar.
        // BehavioralApp.interpreter();

        // 4. Iterator
        // Provides a way to access the elements of an aggregate object sequentially without exposing
        // its underlying representation.
        // BehavioralApp.iterator();

        // 5. Mediator
        // Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping
        // objects from referring to each other explicitly.
        // BehavioralApp.mediator();

        // 6. Memento
        // Provides the ability to restore an object to its previous state.
        // BehavioralApp.memento();

        // 7. Observer
        // Defines a one-to-many dependency between objects so that when one object changes state, all its
        // dependents are notified and updated automatically.
        // BehavioralApp.observer();

        // 8. State
        // Allows an object to alter its behavior when its internal state changes, appearing to change its class.
        // BehavioralApp.state();

        // 9. Strategy
        // Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the
        // algorithm to vary independently of the clients that use it.
        // BehavioralApp.strategy();

        // 10. Template Method
        // Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of
        // the algorithm without changing its structure.
        // BehavioralApp.templateMethod();

        // 11. Visitor
        // Represents an operation to be performed on the elements of an object structure, allowing one to define a
        // new operation without changing the classes of the elements on which it operates.
        // BehavioralApp.visitor();
    }
}
