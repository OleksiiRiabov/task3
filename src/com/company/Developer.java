package com.company;

public class Developer extends Employee {
    private double bonuses;

    public Developer (String position, double ratePerHour, int workdays, double bonuses) {
        this.position = position;
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
        this.bonuses = bonuses;
    }
    public Developer (String position, double ratePerHour, int workdays) {
        this(position, ratePerHour, workdays, 0.0);
    }

    public double getSalary() {
        return ratePerHour * workdays * 8 + bonuses;
    }
}
