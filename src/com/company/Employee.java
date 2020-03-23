package com.company;

public abstract class Employee {
    String position;
    double ratePerHour;
    int workdays;



    public double getSalary() {
        return ratePerHour * workdays * 8;
    }
}
