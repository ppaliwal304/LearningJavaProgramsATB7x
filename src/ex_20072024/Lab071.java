package ex_20072024;

public class Lab071 {
    public static void main(String[] args) {
        boolean a=true;
        a=!a;

        if (2+2>=4){
            System.out.println("inside the if condition");
        }// if condition closed here without else
        System.out.println("outside the if condition and always executed "+a);

        // output:
        // inside the if condition
        // outside the if condition and always executed false
    }

}
