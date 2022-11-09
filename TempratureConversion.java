package com.brigelabz;

import java.util.Scanner;

public class TempratureConversion {

    static void tempratureConversion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter temprature :");
        int celsius = sc.nextInt();
        int celsiusConversion = (celsius * 9 / 5) + 32;
        System.out.println("celsius to fahrenheit : " + celsiusConversion);

        System.out.println("enter temprature :");
        int fahrenheit = sc.nextInt();
        int fahrenheitConversion = (fahrenheit - 32) * 5 / 9;
        System.out.println("fahrenheit to celsius : " + fahrenheitConversion);
    }

    public static void main(String[] args) {

        tempratureConversion();
    }
}
