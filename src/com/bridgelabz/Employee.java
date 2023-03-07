package com.bridgelabz;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program On Master Branch");
        System.out.println("Checking whether Employee is present or absent...");
        int empPresent = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == empPresent){
            System.out.println("Employee is Present");
        }
        else
            System.out.println("Employee is Absent");
    }
}
