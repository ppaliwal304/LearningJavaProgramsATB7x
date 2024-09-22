package ex_28072024_exceptions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        Integer x= sc.nextInt();
        try {

            if (x==0){
                    throw new ArithmeticException("x value should not be zero");
            }
            int a = 10/x;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("value of x");
            throw new RuntimeException(e);
        }

    }
}
