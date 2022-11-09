package com.brigelabz;

import java.util.Scanner;

public class NewtonsMethod {

    static void sqrt(int c){
        double epsilon = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println(t);
    }

    public static void main(String[] args) {
        sqrt(6);
    }
}
