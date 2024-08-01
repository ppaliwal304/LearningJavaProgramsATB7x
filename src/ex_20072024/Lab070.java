package ex_20072024;

public class Lab070 {
    public static void main(String[] args) {
       boolean b=!true;
        if(b=false) {//this is"="assignment operator which is not give true false here
            System.out.println("b is assigned to true");
        }
        else {
            System.out.println("b is false");
        }
    }
}
