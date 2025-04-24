package t3;

public class PayrollTester {
    public static void main(String[] args) {
        // Create employees
        Employee e1 = new Employee();
        e1.setName("John Smith");
        e1.setId("EMP001");
        e1.setSalary(50000.0);

        Employee e2 = new Employee();
        e2.setName("Jane Doe");
        e2.setId("EMP002");
        e2.setSalary(60000.0);

        // Create PMS instance
        PMS pms = new PMS();

        // Add employees
        pms.addEmployee(e1);
        pms.addEmployee(e2);

        // Print initial state
        System.out.println("Initial employee list:");
        pms.printEmployees();

        // Test new salary calculation feature
        double bonus = 5000.0;
        double deductions = 2000.0;
        System.out.println("\nCalculating final salary for " + e1.getName());
        double finalSalary = pms.calculateFinalSalary(e1, bonus, deductions);
        System.out.println("Final salary: $" + finalSalary);

        // Remove an employee
        pms.removeEmployee(e1);

        // Print final state
        System.out.println("\nFinal employee list after removal:");
        pms.printEmployees();
    }
} 