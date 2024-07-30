package ex_13072024;

public class Lab042 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
        int c = a+b;// result type always bigger from operands type 1 and 2
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        int c1 = a1+b1; // result type int only when- operand1,2 are- int,byte,short,char
        // otherwise always choose the bigger one
        System.out.println(c1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 69);
    }
}
