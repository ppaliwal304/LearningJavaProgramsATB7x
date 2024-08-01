package ex_20072024;

import java.util.Scanner;

public class Lab076 {
    public static void main(String[] args) {
        //max. of two numbers with if condition

        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = scn.nextInt();

        System.out.println("Enter num2");
        int num2 = scn.nextInt();

        if(num1>num2) {
            System.out.println("max. of 2 number is: print num1: " + num1);
        }
        else{
            System.out.println("print num2: "+num2);
        }

        scn.close();
    }
}
