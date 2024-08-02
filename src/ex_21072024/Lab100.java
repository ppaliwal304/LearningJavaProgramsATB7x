package ex_21072024;

public class Lab100 {
    public static void main(String[] args) {
        int i=10;
//        while (i<10){
//            System.out.println("inside while loop");//nothing shown as output
//            ++i;
//        }

        do {
            System.out.println("inside the do loop "+ i);// output-- inside the do loop
            ++i;
        }while(i<10);
    }
}
