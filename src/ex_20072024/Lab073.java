package ex_20072024;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {

        // how to take input from user

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter mobile no.");
        long l1 =scn.nextLong();
        System.out.println("Enter single word");

        String s1 = scn.next();

        System.out.println("Enter the sentence");
        //next line function

        String s2 = scn.nextLine();

        System.out.println("Enter the age");

        int age = scn.nextInt();
        System.out.println("Enter the float number");
        float f1=scn.nextFloat();
    }
}
