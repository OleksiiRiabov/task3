package com.company;

public class ScrumMaster extends Employee {

    ScrumMaster (double ratePerHour, int workdays) {
        this.ratePerHour = ratePerHour;
        this.workdays = workdays;
    }

    public String getPosition() {
        return "Scrum Master";
    }
}
