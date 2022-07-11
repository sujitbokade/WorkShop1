package com.bridgelabz.workshop;

import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {
        System.out.println("Enter a Number ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0/i;
        }
        System.out.println("Harmonic Value " + sum);
    }
}
