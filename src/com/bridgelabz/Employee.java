package com.bridgelabz;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program On Master Branch");
        System.out.println("Checking whether Employee is present or absent...");
        int IsPresent = 1;
        int EmpWagePerHour = 20;
        int empHrs, empWage;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == IsPresent){
            System.out.println("Employee is Present");
            empHrs=8;
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
