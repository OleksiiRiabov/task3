package com.company;

public class Main {

    public static void main(String[] args) {
        Company c = new Company("Toshiba",10000.00);
        c.addEmployee("Manager",1.1, 5);
        c.addEmployee("Developer",2.2, 5, 10);
        c.addEmployee("Scrum master",1.1, 5);
        c.getSalaryService();

    }
}
