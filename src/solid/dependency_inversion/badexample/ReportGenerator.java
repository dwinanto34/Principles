package solid.dependency_inversion.badexample;

public class ReportGenerator {
    // Bad example
    // The high level (ReportGenerator) is directly dependent on the low-level implementation (mySQLDatabaseConnection)
    private MySQLDatabaseConnection mySQLDatabaseConnection;

    public ReportGenerator(MySQLDatabaseConnection mySQLDatabaseConnection) {
        this.mySQLDatabaseConnection = mySQLDatabaseConnection;
    }

    public void generate() {
        mySQLDatabaseConnection.connect();
        // DO SOMETHING
    }
}
