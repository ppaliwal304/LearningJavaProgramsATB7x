package ex_28072024_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab117 {
    public static void main(String[] args) throws ArithmeticException, FileNotFoundException{
        int a= 0;// unchecked -arithmetic expression
        try {
            a = 10/0;
        } catch (Exception e) {
            //throw new RuntimeException("math exception issue");
        }
        System.out.println(a);
        FileReader f = new FileReader (new File("C:/Users/PC/Downloads/reena.jpeg"));
        System.out.println("FNE");




    }
}
