package com.brigelabz;

import java.util.Scanner;

public class MonthlyPayment {

    static void monthlyPayment(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter year :");
        double y = sc.nextFloat();
        System.out.println("enter principle amount :");
        double p = sc.nextFloat();
        System.out.println("enter intrest :");
        double r = sc.nextFloat();

        double n = 12 * y;
        double r3 = r / (12 * 100);
        double payment = p * r / (1 - (Math.pow((1 + r3),(-n))));
        System.out.println("monthly payment is : " +payment);
    }

    public static void main(String[] args) {
        monthlyPayment();
    }
}
