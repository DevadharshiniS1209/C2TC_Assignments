package com.tnsif.assignmentfour;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();       // 1 for AirIndia, 2 for KingFisher, 3 for Indigo
        int hours = sc.nextInt();        // hours of travel
        double costPerHour = sc.nextDouble(); // cost per hour

        Airfare airfare; // interface reference

        switch (choice) {
            case 1:
                airfare = new AirIndia(hours, costPerHour);
                break;
            case 2:
                airfare = new KingFisher(hours, costPerHour);
                break;
            case 3:
                airfare = new Indigo(hours, costPerHour);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        airfare.display(); // show total amount
        sc.close();
    }
}
