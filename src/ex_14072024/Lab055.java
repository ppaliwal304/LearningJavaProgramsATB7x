package ex_14072024;

public class Lab055 {
    public static void main(String[] args) {
        String name = "Pramod";//assignment operator >>value store on scp
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Pramod");// with new operator..>>value store on heap(object_
        // How many ways we can a String - 2
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(3));
        //System.out.println(name.toCharArray(4));
        System.out.println(name.indexOf('r'));

    }
}
