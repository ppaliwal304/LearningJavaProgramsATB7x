package ex_28072024_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab116 {
    // Either used Throws with method or try-catch with code to handle exceptions
    // if you handle whole method then use Throws
    // If you handle only some piece of code then use try-catch
    
    public static void main(String[] args) throws FileNotFoundException{

        System.out.println("Hello Pramod");
        String path = "C:/Users/PC/Downloads/reena.jpeg";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
       // System.out.println("file not found");
//        try {
//            FileReader fileReader = new FileReader(file);
//        } catch (FileNotFoundException e) {
//            System.out.println("fnf");
//        }
        System.out.println("FNE");

    }
}
