package exercise.array;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int ar[] = new int[5];

       // int ar1[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < ar.length; i++) {
          ar[i] = s.nextInt();
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
