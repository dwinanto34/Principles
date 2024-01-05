package solid.dependency_inversion.goodexample;

public class ReportGenerator {
    // Good example
    // The high-level module (ReportGenerator) depends on an abstraction (DatabaseConnection), not directly on a low-level implementation.
    // This design choice enhances flexibility, extensibility, and reduces code coupling, making the system easier to maintain and adapt to changes.
    // Additionally, the reliance on abstractions simplifies testing by allowing the use of mock or stub implementations.
    private DatabaseConnection databaseConnection;

    public ReportGenerator(DatabaseConnection databaseConnection) {
        this.databaseConnection = databaseConnection;
    }

    public void generate() {
        databaseConnection.connect();
        // DO SOMETHING
    }
}
