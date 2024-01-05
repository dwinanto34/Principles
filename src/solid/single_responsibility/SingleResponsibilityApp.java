package solid.single_responsibility;

public class SingleResponsibilityApp {
    public static void main(String[] args) {
        // Bad example
        // An Employee class is responsible for multiple tasks such as promote employee, generate report, calculate salary, and calculate bonus.
        Employee employee = new Employee();
        employee.promoteEmployee();
        employee.generateReport();
        employee.calculateSalary();
        employee.calculateBonus();

        // Good example
        // EmployeePromoter class is only responsible for promote employee
        EmployeePromoter employeePromoter = new EmployeePromoter();
        employeePromoter.promoteEmployee();

        // ReportGenerator class is only responsible for generate report
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport();

        // SalaryCalculator class is only responsible for calculate salary
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.calculateSalary();

        // BonusCalculator class is only responsible for calculate bonus
        BonusCalculator bonusCalculator = new BonusCalculator();
        bonusCalculator.calculateBonus();
    }
}
