package ex_13072024;

public class Lab045 {
    public static void main(String[] args) {
        int age=9;
        double d1= 123.567;
        //float f1= 200.10f;
//java: incompatible types: possible lossy conversion from double to int
        double c1= age+d1;

        System.out.println(c1);

        short s = 10;
        char c = 'A'; //65
        int ss = s+c;
        System.out.println(ss);

    }
}
