package com.bridgeLabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        Random random = new Random();
        int attendance = random.nextInt(2);
        int IS_PRESENT_TODAY = 1;

        if (attendance == IS_PRESENT_TODAY){
            System.out.println(" Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");

        }
    }


}
