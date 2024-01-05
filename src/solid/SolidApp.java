package solid;

public class SolidApp {
    public static void main(String[] args) {
        System.out.println("SOLID Principle Overview");

        // 1. Single responsibility principle
        // There should have only one reason to change.
        // It should have only one responsibility or job within a class.

        // 2. Open closed principle
        // Open for extension, but closed for modification.
        // The idea is to create a system that can be easily extended to add new object type without modifying existing code.

        // 3. Liskov substitution principle
        // Subtypes must be substitutable for their base type without altering the correctness of the program.
        // Child class should be able to do all the things that his parents could do.

        // 4. Interface Segregation
        // A class should not be forced to implement interfaces it does not use.
        // Interface is a contract that all class need to implement
        // If we have a bulky methods in the interface, we might not end up using
        // The solution is to split them into different interfaces

        // 5. Dependency Inversion
        // High-level modules should not depend on low-level modules. They should both depend on abstractions.
        // Implementation should depend on abstractions.
        // Abstractions should not depend on the implementations

    }
}
