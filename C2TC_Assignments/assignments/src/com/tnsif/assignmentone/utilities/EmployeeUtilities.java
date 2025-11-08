package com.tnsif.assignmentone.utilities;

import com.tnsif.assignmentone.employees.Employee;

/**
 * The EmployeeUtilities class provides utility methods
 * to operate on Employee objects.
 */
public class EmployeeUtilities {

    /**
     * Increase salary of an employee by percentage.
     * Demonstrates usage of protected setter from Employee.
     */
    public static void increaseSalary(Employee emp, double percentage) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
        emp.setSalary(newSalary); // Accessible due to protected
    }

    /**
     * Print details of an employee.
     */
    public static void printEmployeeDetails(Employee emp) {
        emp.displayInfo();
        System.out.println("-----------------------------");
    }
}
