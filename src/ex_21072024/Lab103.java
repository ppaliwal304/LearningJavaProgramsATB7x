package ex_21072024;

public class Lab103 {
    public static void main(String[] args) {
        // Strings - imutable in nature
        // StringBuilder , StringBuffer
        String s1 = "PRAMOD";
        s1 = "Dutta";
        System.out.println(s1);

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        System.out.println(stringBuffer);
        stringBuffer.append("JI"); //PramodDutta
        System.out.println(stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");
    }
}
