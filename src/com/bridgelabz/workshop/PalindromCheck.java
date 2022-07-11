package com.bridgelabz.workshop;

import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args) {
        System.out.println("Enter a Number");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int reminder=0;
        int temp=n;
         while (n>0){
             reminder=n%10;
             sum=(sum*10)+reminder;
             n=n/10;
         }
         if(temp==sum){
             System.out.println("It is Palindrom Number");
         }
         else {
             System.out.println("It is Not a Palindrom Number");
         }

    }
}
