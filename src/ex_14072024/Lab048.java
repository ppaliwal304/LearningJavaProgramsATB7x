package ex_14072024;

public class Lab048 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        //int total_price = course+GST; // Implicti Narrowing -
        // JVM// java: incompatible types: possible lossy conversion from float to int
        int total_price = course+(int)GST; // Explit narrowing - REAL time - money loss
        double total_price1 = course+(double)GST; // Explit narrowing - REAL time - money loss
        System.out.println(total_price);//118
        System.out.println(total_price1);//118
    }
}
