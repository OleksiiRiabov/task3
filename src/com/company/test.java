package com.company;

public class test {
    public static void main(String[] args) {


        Company c = new Company("Toshiba",10000.00);
        c.addEmployee(new Manager("Manager",1.1, 5));
        c.addEmployee(new Developer("Developer",2.2, 5, 10));
        c.addEmployee(new ScrumMaster("Scrum master",1.1, 5));
        c.getSalaryService();
    }
}
