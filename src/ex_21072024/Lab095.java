package ex_21072024;

public class Lab095 {
    public static void main(String[] args) {
        for (int i = 0; ; ++i) {
            System.out.println("hello");//infinite loop
            break;
        }
        boolean b =true;
        for (int i = 0;b ; i++) {
            System.out.println("hello");//infinite loop
            break;
        }
        for (int i = 0;;) {
            System.out.println("Hello");//infinte loop
            break;
        }
        for(;;){
            System.out.println("hello");//infinte loop
            break;
        }
    }
}
