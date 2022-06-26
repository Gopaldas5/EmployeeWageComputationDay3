package com.bridgeLabz;

import java.util.Random;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        Random random = new Random();
        int attendance = random.nextInt(3);
        int IS_PRESENT_DAY = 1;
        int IS_ABSENT_DAY = 0;
        int IS_HALF_DAY = 2;
        int WAGE_PER_HOUR = 20;
        int FULL_DAY_TIME = 8;
        int HALF_DAY_TIME = 4;
        int TOTAL_EMP_WAGE = 0;

        if (attendance == IS_PRESENT_DAY){
            TOTAL_EMP_WAGE = WAGE_PER_HOUR * FULL_DAY_TIME;
            System.out.println(" Employee is Present ");
            System.out.println(" Employee is working full day");
            System.out.println(" Total employee wage:- "+TOTAL_EMP_WAGE);
        }
        else if(attendance ==IS_HALF_DAY){
            TOTAL_EMP_WAGE = WAGE_PER_HOUR * HALF_DAY_TIME;
            System.out.println("Employee is present ");
            System.out.println("Employee is working half day");
            System.out.println("Total employee wage:- "+TOTAL_EMP_WAGE);
        }
        else{
            System.out.println("Employee is absent");
            System.out.println("Total employee wage:- "+TOTAL_EMP_WAGE);

        }
    }

}
