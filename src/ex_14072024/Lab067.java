package ex_14072024;

public class Lab067 {
    public static void main(String[] args) {
        String s1 = "geeksquiz";
        String s2 = "geeksquiz";
        Boolean s3=(s1==s2);
        System.out.println("s1 == s2 is:" + s3);// true
        System.out.println("s1 == s2 is:" + s1 == s2);// false
        // + operator precedence is more than == operator.
        //So the given expression will be evaluated to
        // “s1 == s2 is:geeksquiz” == “geeksquiz” i.e false.
    }
}
