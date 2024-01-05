package solid.dependency_inversion.goodexample;

public class PostgreSQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL Server...");

    }
}
