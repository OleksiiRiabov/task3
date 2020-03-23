package com.company;

import java.util.ArrayList;

public class Company {
    public String name;
    public double budget;
    public ArrayList<Employee> employees = new ArrayList<>();

    public Company(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public SalaryService getSalaryService() {
        SalaryService s = new SalaryService();
        s.pay(budget, employees);
        return s;
    }
}
