package com.company;

import java.util.ArrayList;

public class SalaryService {

    public void pay(double budget, ArrayList<Employee> list) {
        double salarySum = 0;
        for(int i = 0; i < list.size(); i++) {
            salarySum += list.get(i).getSalary();
        }
        if (budget < salarySum) {
            System.out.println("The company budget is too low");
        } else {
            for(int j = 0; j < list.size(); j++) {
            System.out.println("The salary to "+list.get(j).position+" was paid in amount of "+list.get(j).getSalary()+"$");
            }
        }
    }
}
