package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        // Program to Check
        // if a Number is Positive
        // , Negative,
        // or Zero.

        Scanner abc = new Scanner(System.in);

        int num = abc.nextInt();

        if (num>0)
        {
            System.out.println("number is positive: "+num);
        } else if (num==0) {
            System.out.println("number is zero:"+num);
        }
        else {
            System.out.println("number is negative:"+num);

        }
    }
}
