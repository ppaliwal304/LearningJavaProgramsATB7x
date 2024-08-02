package ex_20072024;

import java.util.Scanner;

public class Lab084 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a','A','e','i','o','u','E','I','O','U':
                System.out.println("Character is vowel: "+ch);
                break;
            default:
                System.out.println("Character is consonant: "+ch);

        }
    }
}
