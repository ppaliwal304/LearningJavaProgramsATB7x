package ex_14072024;

public class Lab054 {
    public static void main(String[] args) {

        //Concatenation
        int a = 87;
        long b = 91;
        String s1 = "KK";
        String s2 = "VV";
        System.out.println(s1+s2+a+b);
        System.out.println(a+b+s1+s2);
        System.out.println(s1+s2+(a+b));
        System.out.println("KK"+"vv"+87+91);

        /*Output
        KKVV8791
        178KKVV
        KKVV178
        KKvv8791
         */
    }
}
