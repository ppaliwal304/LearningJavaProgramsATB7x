package ex_21072024;

public class Lab099 {
    public static void main(String[] args) {
        //continue
        for (int i = 0; i < 7; i++) {
            System.out.println(i);// output- 0,1,2,3,4,5
            if (i == 5) {
                continue;
            }

            System.out.println("outside loop");//// output- 0,1,2,3,4
        }
/*output
        0
        outside loop
        1
        outside loop
        2
        outside loop
        3
        outside loop
        4
        outside loop
        5
        6
        outside loop
*/
    }
}
