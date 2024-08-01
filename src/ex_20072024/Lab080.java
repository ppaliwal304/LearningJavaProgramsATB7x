package ex_20072024;

public class Lab080 {
    public static void main(String[] args) {

        // execute line by line if first false then not run any function

        if (true) {
            System.out.println("1");

            if (true) {
                System.out.println("2");

                if (false) {
                    System.out.println("3");
                }// output-1 2

                //if (false) {
                //   System.out.println("1");

                //if (true) {
                //  System.out.println("2");
                // }
            }// output null(nothing)

        }
    }
}
