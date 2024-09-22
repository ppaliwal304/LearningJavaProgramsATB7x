package ex_28072024_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab118 {
    public static void main(String[] args) {
        //Throw- Custom exception

        Bank sbi = new Bank("INR", 100);
        //Bank icici = new Bank("INR", 100);
        Bank jpmorgan = new Bank("dinar", 10);
        // currency is not match so, we create exception in Bank Class.
        Integer total = sbi.add(jpmorgan);
        System.out.println(total);




    }
}
