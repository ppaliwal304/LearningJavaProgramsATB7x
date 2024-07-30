package ex_13072024;

public class Lab044 {
    public static void main(String[] args) {
        double d1 =9.998;
        long height= 985l;
        //long c= age+height;//java: incompatible types: possible lossy conversion from double to long
        double c= height+d1;
        System.out.println(c);
    }
}
