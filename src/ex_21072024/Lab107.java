package ex_21072024;

public class Lab107 {
    public static void main(String[] args) {

    // highest number find
    int num = 20;
    int num1 = 30;
    int num2 = 40;
    if(num>=num1 &&num>=num2) {
        System.out.println(" num1");
    }else if (num1 >= num && num1 >= num2) {
        System.out.println("num2");
    } else {
        System.out.println("num3: "+num2);
    }
    }
}

