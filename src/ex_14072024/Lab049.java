package ex_14072024;

public class Lab049 {
    public static void main(String[] args) {
        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println(s);//5866-- loss data--
        // JVM - GC -
    }
}
