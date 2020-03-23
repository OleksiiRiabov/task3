package com.company;

public class Main {

    public static void main(String[] args) {
        Company c = new Company("Toshiba",10000.00);
        c.addEmployee(new Manager("Manager",8, 5));
        c.addEmployee(new Developer("Developer",10, 5, 100));
        c.addEmployee(new ScrumMaster("Scrum master",9, 5));
        c.getSalaryService();

    }
}
