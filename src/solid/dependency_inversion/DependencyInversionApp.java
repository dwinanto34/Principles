package solid.dependency_inversion;

import solid.dependency_inversion.badexample.MySQLDatabaseConnection;
import solid.dependency_inversion.goodexample.PostgreSQLDatabaseConnection;

public class DependencyInversionApp {
    public static void main(String[] args) {
        // Bad example
        MySQLDatabaseConnection mySQLDatabaseConnection = new MySQLDatabaseConnection();
        solid.dependency_inversion.badexample.ReportGenerator badReportGenerator = new solid.dependency_inversion.badexample.ReportGenerator(mySQLDatabaseConnection);
        badReportGenerator.generate();

        // Good example
        PostgreSQLDatabaseConnection postgreSQLDatabaseConnection = new PostgreSQLDatabaseConnection();
        solid.dependency_inversion.goodexample.ReportGenerator goodReportGenerator = new solid.dependency_inversion.goodexample.ReportGenerator(postgreSQLDatabaseConnection); // Corrected this line
        goodReportGenerator.generate();
    }
}