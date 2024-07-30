package ex_13072024;

public class Lab034 {
    public static void main(String[] args) {
// Relational Operators -> boolean
        //    // >, < >=,<=, == , != ( ! = ) - true or false.
        int a = 10;
        int b = 20;
        int sum = a+b; // operand a, b , operator =, +
        int age_mamitha = 34;
        int age_pramod = 34;
        boolean result = age_pramod > age_mamitha;
        System.out.println(result);

       boolean result1 = age_pramod < age_mamitha;
        System.out.println(result1);
        boolean result2 = age_pramod >= age_mamitha; // OR gate
        System.out.println(result2);
    }
}
