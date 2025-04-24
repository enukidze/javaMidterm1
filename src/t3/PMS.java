package t3;

import java.util.ArrayList;
import java.util.List;

public class PMS {
    private List<Employee> employees = new ArrayList<Employee>();

    // adds the employee to the system
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // removes the employee from the system
    public boolean removeEmployee(Employee employee) {
        boolean removed = false;
        for (int i = 0; i < employees.size(); i++) {
            Employee e = employees.get(i);
            if (e.getId().equals(employee.getId())) {
                employees.remove(i);
                removed = true;
                break;
            }
        }
        return removed;
    }

    // prints all employees
    public void printEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the system");
        } else {
            for (Employee e : employees) {
                System.out.println(e.toString());
                System.out.println();
            }
        }
    }

    /* New Feature: Salary Calculator
     * This feature calculates the final salary for an employee
     * taking into account base salary, bonuses, and deductions
     */
    public double calculateFinalSalary(Employee employee, double bonus, double deductions) {
        double baseSalary = employee.getSalary();
        return baseSalary + bonus - deductions;
    }
} 