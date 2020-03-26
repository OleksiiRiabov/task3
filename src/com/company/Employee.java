package com.company;

public abstract class Employee {
    double ratePerHour;
    int workdays;

    public double getSalary() {
        return ratePerHour * workdays * 8;
    }

    public String getPosition() {
        return "Employee";
    }
}
