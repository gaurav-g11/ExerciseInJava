package exercise.basic;

public class Fibonacci {

    public static void main(String[] args) {
        //System.out.println(printNthFibonacci(9));
        // printFibonacciSeriess(7);
        fibonacciSeriesUsingRecursion(10);
    }

    public static void printFibonacciSeries(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
    }

    //Another Way to print fibonacciSeries
    public static void printFibonacciSeriess(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a + " " + b + " ");
        for (int i = 1; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }


    public static int printNthFibonacci(int n) {
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 0; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return a;
    }

    static void fibonacciSeriesUsingRecursion(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print(a+" "+b);
        if (n >= 1) {
            c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
            fibonacciSeriesUsingRecursion(n-1);
        }
    }
}
