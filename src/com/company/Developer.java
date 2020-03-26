package com.company;

public class Developer extends Employee {
    private double bonuses;

    Developer (double ratePerHour, int workdays, double bonuses) {
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
        this.bonuses = bonuses;
    }
    Developer (double ratePerHour, int workdays) {
        this(ratePerHour, workdays, 0.0);
    }

    public String getPosition() {
        return "Developer";
    }

    public double getSalary() {
        return ratePerHour * workdays * 8 + bonuses;
    }
}
