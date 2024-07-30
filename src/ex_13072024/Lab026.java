package ex_13072024;

public class Lab026 {
    public static void main(String[] args) {
        final int age =99;
       // age=100;
        System.out.println(age);// output-100 when int age =99;
        System.out.println(age);// output- error java: cannot assign a value to final variable age, age -100;
        System.out.println(age);// output-99;
    }
}
