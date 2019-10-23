package exercise.basic;

import java.util.Scanner;

public class PascalPattern {
    public static void main(String[] args) {
      //  printPascal3(10);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printPascalTriangle(num);
    }

    public static void printPascal(int n) {
        // Iterate through every line
        // and print entries in it
        for (int line = 0; line < n; line++) {
            // Every line has number of
            // integers equal to line number
            for (int i = 0; i <= line; i++)
                System.out.print(binomialCoeff
                        (line, i) + " ");

            System.out.println();
        }
    }

    // Link for details of this function
    // https://www.geeksforgeeks.org/space-and-time-efficient-binomial-coefficient/
    //Method 2
    static int binomialCoeff(int n, int k) {
        int res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }

    //Method 2
    public static void printPascal2(int n) {
// An auxiliary array to store generated pascal triangle values
        int[][] arr = new int[n][n];

// Iterate through every line and print integer(s) in it
        for (int line = 0; line < n; line++) {
            // Every line has number of integers equal to line number
            for (int i = 0; i <= line; i++) {
                // First and last values in every row are 1
                if (line == i || i == 0)
                    arr[line][i] = 1;
                else // Other values are sum of values just above and left of above
                    arr[line][i] = arr[line - 1][i - 1] + arr[line - 1][i];
                System.out.print(arr[line][i]);
            }
            System.out.println("");
        }
    }

    //Pascal function
    //Method 3
    public static void printPascal3(int n) {
        for (int line = 1; line <= n; line++) {

            int C = 1;// used to represent C(line, i)
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }


  /*  public static void printPascalTriangle(int n) {
        for (int line = 1; line <= n; line++) {
            for(int k=n; k>line; k--)
            {
                System.out.print(" ");
            }
            int C = 1;// used to represent C(line, i)
            for (int i = 1; i <= line; i++) {
                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }*/

    private static void printPascalTriangle(int n) {
        for(int i=1;i<=n;i++) {
            for(int j=n;j>i;j--) {
                System.out.print(" ");
            }
            int c = 1;
            for(int k = 1; k <= i;k++) {
                System.out.print(c+" ");
                c = c * (i-k)/k;
            }
            System.out.println();
        }
    }
}
