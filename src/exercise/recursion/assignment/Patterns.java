package exercise.recursion.assignment;


/* 2. Take as input N, a number. Print the following pattern (for N = 5)
 *
 * *
 * * *
 * * * *
 * * * * *
 */

/* 3. Take as input N, a number. Print the following pattern (for N = 5)
 * * * * *
 * * * *
 * * *
 * *
 *
 */

/* 4. Take as input N, a number. Print the following pattern (for N = 6)
      1
      1 1
      1 2 1
      1 3 3  1
      1 4 6  4  1
      1 5 10 10 5 1
                         */

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //printPattern2(n, 0);
        withRecursionPrintPattern4(n,0);
        //withOutRecursionPrintPattern4(n);
    }

    public static void printPattern2(int n, int m) //where n = col and m = col
    {
        if (n == 0) {
            return;
        }

        if (n == m) {
            printPattern2(n - 1, 0);
            System.out.println();
            return;
        }

        printPattern2(n, m + 1);
        System.out.print(" * ");
    }

    public static void printPattern3(int n, int m) {
        if (n == 0) {
            return;
        }

        if (n == m) {
            System.out.println();
            printPattern3(n - 1, 0);
            return;
        }
        System.out.print(" * ");
        printPattern3(n, m + 1);
    }

    public static void withOutRecursionPrintPattern4(int n) {
        for (int i = 1; i <= n; i++) {
             int c = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(c+" ");
                c = c * (i-j)/j;
            }
            System.out.println();
        }
    }

    public static void withRecursionPrintPattern4(int i,int j) {
        int c = 1;
        if(i == 0){return;}

        if(i == j){
          //  c = c * (i-j)/j;
            withRecursionPrintPattern4(i-1,0);
            System.out.println();
            return;
        }

        withRecursionPrintPattern4(i,j+1);
        System.out.print(c+" ");
    }
}
