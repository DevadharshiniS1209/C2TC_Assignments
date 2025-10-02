package com.tnsif.assignmentone;


import com.tnsif.assignmentone.employee.Manager;
import com.tnsif.assignmentone.employee.Developer;
import com.tnsif.assignmentone.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", "M001", 75000, "HR");
        Developer dev = new Developer("Bob", "D001", 60000, "Java");

        EmployeeUtilities util = new EmployeeUtilities();

        util.printEmployeeDetails(mgr);
        util.printEmployeeDetails(dev);

        util.giveRaise(mgr, 5000);
        util.giveRaise(dev, 4000);
    }
}