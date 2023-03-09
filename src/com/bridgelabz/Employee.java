package com.bridgelabz;

import java.util.Scanner;

public class Employee {

        public static final int IsFullTime=1;
        public static final int IsPartTime = 2;

    public void ComputeWage(int EmpWagePerHour, int WorkingDaysPerMonth, int TotalWorkingHours){
        int empHrs, empWagePerDay, empWagePerMonth=0, totalWorkingDays=0, totalEmpHours = 0;
        while(totalEmpHours <= TotalWorkingHours && totalWorkingDays < WorkingDaysPerMonth) {
            totalWorkingDays++;
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
            totalEmpHours+=empHrs;
            empWagePerDay = empHrs * EmpWagePerHour;
            empWagePerMonth += empWagePerDay;
            System.out.println("Employee Wage per Day: " + empWagePerDay);
        }
        System.out.println("Emp Wage Per Month : "+empWagePerMonth);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation Program On Master Branch");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Enter the Company Name: \n1.TCS\n2.Cognizant\n3.Infosys");
        int company= in.nextInt();
        Employee employee= new Employee();
        switch (company){
            case 1:
                employee.ComputeWage(300,20,100);
                break;
            case 2:
                employee.ComputeWage(500,23,120);
                break;
            case 3:
                employee.ComputeWage(200,25,150);
                break;
            default:
                System.out.println("Please choose a valid company.");
        }
    }
}
