package ex_21072024;

public class Lab110 {
    public static void main(String[] args) {
        // remove duplicate string

        //String input =new String("abbccdeef");
        //String output= new String(" ");
          String str = "Hello";
          String result="";

        for (int i=0; i<str.length(); i++)
        {
            String ch= ""+ str.charAt(i);
            if (result.contains(ch)){
                continue;
            }
            result= result+ch;

        }
        System.out.println(" duplcate text is: "+result);

    }
}
