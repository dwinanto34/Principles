package solid.open_closed;

public class OpenClosedApp {
    public static void main(String[] args) {
        // Bad example
        // By having Manager and Vice President implementations in the same class (Employee)
        // Future changes to the Manager's salary calculation may impact Vice President's implementation,
        Employee managerEmployee = new Employee();
        managerEmployee.setType("Manager");
        managerEmployee.calculateSalary();

        Employee vicePresidentEmployee = new Employee();
        vicePresidentEmployee.setType("Vice President");
        vicePresidentEmployee.calculateSalary();

        // Good example
        // By having Manager and Vice President implementations in different classes,
        // Future changes to the Manager's salary calculation only require modifying the Manager class,
        // keeping the Vice President class unaffected.
        Manager manager = new Manager();
        manager.calculateSalary();

        VicePresident vicePresident = new VicePresident();
        vicePresident.calculateSalary();
    }
}
