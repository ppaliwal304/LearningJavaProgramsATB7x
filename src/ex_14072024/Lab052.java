package ex_14072024;

public class Lab052 {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
       System.out.println(result);
           // Exp = 10 , a = 11?


        int a1 = 10;
        int result1 = ++a1;
        System.out.println(a1);
        System.out.println(result1);

        // Exp = 11 , a = 11?

        int a3 = 10;
        System.out.println(a3++ + a3);
        // A = a++ -> 10 , a = 11
        // +
        // B = a = 11 ->  A+B = 10+11
    }
}
