package design_patterns;

import design_patterns.creational.CreationalApp;
import design_patterns.structural.StructuralApp;

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

    }
}
