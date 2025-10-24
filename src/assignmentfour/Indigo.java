package com.tnsif.assignmentfour;

public class Indigo implements Airfare {
    private Integer hours;
    private Double costPerHour;

    // Default Constructor
    public Indigo() {}

    // Parameterized Constructor
    public Indigo(Integer hours, Double costPerHour) {
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
        return hours * costPerHour * 8;
    }

    @Override
    public void display() {
        System.out.printf("%.2f\n", calculateAmount());
    }
}
