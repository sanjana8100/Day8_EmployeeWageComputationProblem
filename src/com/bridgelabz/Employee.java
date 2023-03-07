package com.bridgelabz;

public class Employee {
    public static final int IsFullTime = 1;
    public static final int IsPartTime = 2;
    public static final int EmpWagePerHour = 20;
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program On Master Branch");

        int empHrs, empWage;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        switch ((int) empCheck) {
            case IsFullTime:
                System.out.println("Employee is Doing Full Time:");
                empHrs = 8;
                break;
            case IsPartTime:
                System.out.println("Employee is Doing Part Time:");
                empHrs = 4;
                break;
            default:
                System.out.println("Employee is Absent:");
                empHrs = 0;
                break;
        }
        empWage = empHrs * EmpWagePerHour;
        System.out.println("Employee Hours: "+empHrs);
        System.out.println("Employee Wage: "+empWage);
    }
}
