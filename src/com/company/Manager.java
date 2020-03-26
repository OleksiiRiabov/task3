package com.company;

public class Manager extends Employee {

    Manager (double ratePerHour, int workdays) {
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
    }

    public String getPosition() {
        return "Manager";
    }
}
