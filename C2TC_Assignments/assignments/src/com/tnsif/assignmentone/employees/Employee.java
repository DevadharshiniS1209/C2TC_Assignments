package com.tnsif.assignmentone.employees;

public class Employee {
	 private String name;
	    private int employeeId;
	    private double salary;

	    public Employee(String name, int employeeId, double salary) {
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

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // Changed from protected → public so utilities can access
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
	    }

}