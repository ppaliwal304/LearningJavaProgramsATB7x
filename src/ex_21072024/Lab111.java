package ex_21072024;

public class Lab111 {
    public static void main(String[] args) {
        // find the prime number

        int num=91;
        int count=0;

        if (num>1)
        {
            //System.out.println("prime number");
            for (int i=1; i<=num; i++) {
                if (num % i == 0)
                    count++;
            }
                if (count==2){
                    System.out.println(" number is prime:"+num);
                }
                else {
                    System.out.println("number is no prime:" +num);
                }

            }

        else{
            System.out.println("not prime number:");
        }
    }
}
