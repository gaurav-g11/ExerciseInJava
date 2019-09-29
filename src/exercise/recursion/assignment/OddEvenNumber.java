package exercise.recursion.assignment;

/* 1. Take as input N, a number.
Print odd numbers in decreasing sequence (up until 0)
and even numbers in increasing sequence(up until N).
E.g. for N = 6 print 5, 3, 1, 2, 4. */

import java.util.Scanner;

public class OddEvenNumber {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        n = n-1;
        printOddEvenNumber(n);
    }

    public static void printOddEvenNumber(int n){
        if(n <= 0){ return; }

        if(n % 2 != 0){
            System.out.print(n+" ");
        }

        if(n > 0){
            printOddEvenNumber(n-1);
        }

        if(n% 2 == 0){
            System.out.print(n+" ");
        }
    }
}
