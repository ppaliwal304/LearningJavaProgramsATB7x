package ex_28072024_exceptions;

public class Lab121 {
    public static void main(String[] args){
        try {
            String s1= null;
            if(s1==null){
                throw new NullPointerException("used proper string");
            }
            s1.trim();
        } catch (NullPointerException e) {
            System.out.println("null pointer");
            throw new RuntimeException(e);
        }
    }
}
