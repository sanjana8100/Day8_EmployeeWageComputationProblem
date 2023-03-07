package com.bridgelabz;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program On Master Branch");
        System.out.println("Checking whether Employee is present or absent...");
        int IsFullTime = 1;
        int IsPartTime = 2;
        int EmpWagePerHour = 20;
        int empHrs, empWage;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == IsFullTime){
            System.out.println("Employee is working Full Time.");
            empHrs=8;
        }
        else if(empCheck == IsPartTime){
            System.out.println("Employee is working Part Time.");
            empHrs=4;
        }
        else {
            System.out.println("Employee is Absent");
            empHrs = 0;
        }
        empWage = empHrs * EmpWagePerHour;
        System.out.println("Employee Hours: "+empHrs);
        System.out.println("Employee Wage: "+empWage);
    }
}
