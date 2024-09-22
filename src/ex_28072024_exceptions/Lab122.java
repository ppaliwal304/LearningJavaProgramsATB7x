package ex_28072024_exceptions;

import java.sql.SQLOutput;

public class Lab122 {
    public static void main(String[] args) {
        String s1 ="Pramod";
        String s2 ="pramod";
        if (s1.equalsIgnoreCase(s2)){
            System.out.println("Matched");
            //throw new Exception("match");
        }
        else{
            System.out.println("not matched");
        }
        // final -> constant
        // finally -> block of code with the try and catch
        // finalize -> Object class function - threading use case
    }
}
