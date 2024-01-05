package solid.dependency_inversion.goodexample;

public class MySQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("Connecting to MySQL Server...");
    }
}
