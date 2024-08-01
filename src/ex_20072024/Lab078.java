package ex_20072024;

import java.util.Scanner;

public class Lab078 {
    public static void main(String[] args) {
         //✅ Grade Calculator:
//        Write a program that calculates and displays
//        the letter grade for a given numerical
//        score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69
//        F: 0-59

        Scanner scn = new Scanner(System.in);
         int num = scn.nextInt();

         if (num>=90 && num<=100) {
             System.out.println(" print the grade: A");
         } else if (num>=80 && num<=89) {
             System.out.println("print the grade: B");
         } else if (num>=70 && num<=79) {
             System.out.println("print the grade: C");
         }else if (num>=60 && num<=69) {
             System.out.println("print the grade: D");
         }
         else if (num<0 || num>100) {
            System.out.println("number is not in grade category please check");
         }
         else {
             System.out.println("print the grade: F");
         }
         scn.close();

    }

    }


