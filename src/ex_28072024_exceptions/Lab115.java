package ex_28072024_exceptions;

public class Lab115 {
    // Exception passing concept

    public static void main(String[] args) {
        extracted();
    }
    private static void extracted(){
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer[] i= new Integer[2];
            System.out.println(i[3]);
        } catch (Exception e) {
            System.out.println("array out of bond exception");
        } finally {
            System.out.println("end of program");
        }
    }
}
