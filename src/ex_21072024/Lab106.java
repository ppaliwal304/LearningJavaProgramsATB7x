package ex_21072024;

import java.util.Scanner;

public class Lab106 {
    public static void main(String[] args) {
        // find even and odd

       /* Scanner find_number = new Scanner(System.in);
        int num = find_number.nextInt();
        if (num % 2 == 0) {
            System.out.println("number is odd");

        } else {
            System.out.println("number is even");
        }*/
        // find even and odd for loop 1-100
       // int num = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println("number is even: " +i);

            } else {
                System.out.println("number is odd: " +i);
            }

        }
    }
}


