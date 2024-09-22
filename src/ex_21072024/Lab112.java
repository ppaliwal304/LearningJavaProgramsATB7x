package ex_21072024;

public class Lab112 {
    public static void main(String[] args) {
        for (int i=1; i<=50; i++)
        {
            int flag=0;
            for (int j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    flag=1;

                }
            }
            if (flag==0)
            {
                System.out.println(" number is prime: "+ i);
            }
        }
    }
}
