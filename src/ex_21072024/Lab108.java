package ex_21072024;

public class Lab108 {
    public static void main(String[] args) {

        // 3rd, 2nd last highest number find just change [size-1], [size-2], [size-3]
        int number[]= { 20,30,40};
        int temp, size;
        size= number.length;

        for(int i=0; i<=size; i++) {
            for (int j = i + 1; j < size; j++) {
                if ( number[i]>number[j])
                {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println(" 3rd highest number is: "+ number[size-3]);


    }
}

