package com.company;

import java.util.ArrayList;

 class Company {
    private String name;
    private double budget;
    private ArrayList<Employee> employees = new ArrayList<>();

    Company(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    void getSalaryService() {
        SalaryService s = new SalaryService();
        s.pay(name, budget, employees);
    }
}
