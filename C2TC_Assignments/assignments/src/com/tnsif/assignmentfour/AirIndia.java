package com.tnsif.assignmentfour;

public class AirIndia implements Airfare {
    private Integer hours;
    private Double costPerHour;

    // Default Constructor
    public AirIndia() {}

    // Parameterized Constructor
    public AirIndia(Integer hours, Double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(Double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Method Implementation
    @Override
    public Double calculateAmount() {
        return hours * costPerHour;
    }

    @Override
    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}
