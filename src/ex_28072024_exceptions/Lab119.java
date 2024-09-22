package ex_28072024_exceptions;

import java.util.Scanner;

public class Lab119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        if (name.equalsIgnoreCase("Pramod")){
            try {
                throw new Exception("Not allowed!!");
            } catch (Exception e) {
                //throw new RuntimeException(e);
               System.out.println("Exception!!");
            }
        }else {
            System.out.println("Allowed!");
        }
    }
}

