package com.company;

public class Employee {
    public String position;
    private double ratePerHour;
    private int workdays;
    private double bonuses;

    public Employee(String position, double ratePerHour, int workdays) {
        this.position = position;
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
    }

    public Employee(String position, double ratePerHour, int workdays, double bonuses) {
        this.position = position;
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
        this.bonuses = bonuses;
    }

    public double getSalary() {
        double salary = ratePerHour * workdays * 8;

        if(position.equals("Developer")) {
            salary += bonuses;
        }
        return salary;
    }
}
