package com.tnsif.assignmentone.employee;


public class Employee {
    private String name;
    private String employeeId;
    private double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
    }
}