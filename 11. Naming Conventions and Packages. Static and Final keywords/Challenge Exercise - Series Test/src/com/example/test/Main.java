package com.example.test;

import com.Series.Series;

public class Main {

    public static void main(String[] args) {

        System.out.println("-".repeat(50));
        System.out.print("nSum = ");
        for(int i = 0; i <= 10; i++) {
            System.out.print(Series.nSum(i) + " ");
        }
        System.out.println();

        System.out.println("-".repeat(50));
        System.out.print("nSum = ");
        for(int i = 0; i <= 10; i++) {
            System.out.print(Series.factorial(i) + " ");
        }
        System.out.println();

        System.out.println("-".repeat(50));
        System.out.print("nSum = ");
        for(int i = 0; i <= 10; i++) {
            System.out.print(Series.fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println("-".repeat(50));
    }
}