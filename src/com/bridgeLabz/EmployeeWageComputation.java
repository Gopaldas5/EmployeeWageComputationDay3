package com.bridgeLabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        Random random = new Random();
        int attendance = random.nextInt(2);
        int IS_PRESENT_TODAY = 1;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;
        int ABSENT_DAY_HOUR = 0;
        int TOTAL_EMP_WAGE = 0;

        if (attendance == IS_PRESENT_TODAY){
            TOTAL_EMP_WAGE = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println(" Employee is Present");
            System.out.println("Total employee wage:- "+TOTAL_EMP_WAGE);

        }
        else{
            TOTAL_EMP_WAGE = WAGE_PER_HOUR * ABSENT_DAY_HOUR;
            System.out.println("Employee is Absent");
            System.out.println("Total employee wage:- "+TOTAL_EMP_WAGE);

        }



    }


}
