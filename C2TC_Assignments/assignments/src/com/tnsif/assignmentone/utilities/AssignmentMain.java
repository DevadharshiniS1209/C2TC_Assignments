package com.tnsif.assignmentone.utilities;


import com.tnsif.assignmentone.employees.Developer;
import com.tnsif.assignmentone.employees.Manager;
import com.tnsif.assignmentone.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager("Alice", 101, 75000, "HR");
        Developer developer = new Developer("Bob", 202, 60000, "Java");

        // Display initial details
        System.out.println("Initial Employee Details:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        // Increase salary
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

        // Display updated details
        System.out.println("After Salary Increase:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}