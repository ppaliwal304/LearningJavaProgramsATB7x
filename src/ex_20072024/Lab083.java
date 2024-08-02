package ex_20072024;

import java.util.Scanner;

public class Lab083 {
    public static void main(String[] args) {


        // Find vowels and consonant

        Scanner scn = new Scanner(System.in);
        char ch =scn.next().charAt(0);

         //char ch ='a';

         switch(ch){
            case 'a':
                 System.out.println("char is vowel: " +ch);
                 break;

            case 'e':
                System.out.println("char is vowel: " +ch);
                break;

            case 'i':
                System.out.println("char is vowel: " +ch);
                break;

            case 'o':
                System.out.println("char is vowel: " +ch);
                break;

            case 'u':
                System.out.println("char is vowel: " +ch);
                break;
            default:
                System.out.println("char is consonant " +ch);
        }



    }
}
