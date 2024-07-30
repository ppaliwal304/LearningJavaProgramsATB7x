package ex_14072024;

public class Lab047 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss


        // Widening
        byte b=10;
        int a=b; // VALID – Implicit Casting - JVM
        int a1= (int)b; // VALID – Explicit Casting
        System.out.println(a1);

        // Narrowing
        int val = 300;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        byte b1 = (byte)val; // InVALID – Explicit Casting - // Loss of data byte bit are less compare to int
        // so half data read and compile
        System.out.println(b1);

    }
}
