package ex_21072024;

import java.util.Scanner;

public class Lab109 {
    public static void main(String[] args) {
        // reverse a word by word

        /*
        String str= "araM";
        String reverse_string="";
        char ch;
        for ( int i=0; i<str.length(); i++)
        {
            ch=str.charAt(i);
            reverse_string= ch+reverse_string;
        }
        System.out.println(" print reverse word: " + reverse_string);

         */
        // reverse a sentence
        String name= "hello java hello";
        String reverse_string="";
        String a[]= name.split(" ");
        for (int i=0; i<a.length; i++){
            reverse_string= a[i]+" "+reverse_string;
        }
        System.out.println(" print reverse word: " + reverse_string);

        //Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        String str= "hello java";
        String rev1 = "";

        //Breaking the sentence into words
        String s[] = str.split(" ");

        //Adding the words stored in the array to the last
        for(int j=0;j<s.length;j++){
            rev1 = s[j]+" "+rev1;
        }

        //Printing the reversed sentence
        System.out.println("Reversed sentence: " + rev1);
    }
}


