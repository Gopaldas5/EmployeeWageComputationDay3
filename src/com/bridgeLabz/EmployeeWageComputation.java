package com.bridgeLabz;

import java.util.Random;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program ");
        Random random = new Random();
        int attendance = random.nextInt(3);
        final int IS_FULL_DAY = 1;
        final int IS_ABSENT_DAY = 0;
        final int IS_HALF_DAY = 2;
        int FULL_DAY_TIME = 8;
        int HALF_DAY_TIME = 4;
        int IS_ABSENT_TIME = 0;
        int WAGE_PER_HOUR = 20;
        int total_emp_time = 0;
        int total_emp_wage = 0;

         switch (attendance) {
             case IS_FULL_DAY:
                 total_emp_time = FULL_DAY_TIME;
                 System.out.println("Employee is working full time");
                break;
             case IS_HALF_DAY:
                 total_emp_time = HALF_DAY_TIME;
                 System.out.println("Employee is working half time");
                break;
             default:
                 total_emp_time = IS_ABSENT_TIME;
                 System.out.println("Employee is absent");
        }

        total_emp_wage += WAGE_PER_HOUR * total_emp_time;
        System.out.println("Total wage of employee= "+total_emp_wage);
    }

}
