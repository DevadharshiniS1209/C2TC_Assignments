package com.tnsif.assignmenttwo;

import java.util.Scanner;

/**
* The Commission class represents a sales employee
* and calculates commission based on sales amount.
*/
class Commission {
//Data members
private String name;
private String address;
private String phone;
private double salesAmount;

//Method to accept details
public void acceptDetails() {
Scanner sc = new Scanner(System.in);

System.out.print("Enter Name: ");
name = sc.nextLine();

System.out.print("Enter Address: ");
address = sc.nextLine();

System.out.print("Enter Phone: ");
phone = sc.nextLine();

System.out.print("Enter Sales Amount: ");
salesAmount = sc.nextDouble();
}

//Method to calculate commission
public void calculateCommission() {
double commission;

if (salesAmount >= 100000) {
   commission = salesAmount * 0.10;
} else if (salesAmount >= 50000) {
   commission = salesAmount * 0.05;
} else if (salesAmount >= 30000) {
   commission = salesAmount * 0.03;
} else {
   commission = 0;
}

System.out.println("Employee: " + name);
System.out.println("Sales Amount: " + salesAmount);
System.out.println("Commission: " + commission);
}
}