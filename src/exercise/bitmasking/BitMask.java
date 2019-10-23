package exercise.bitmasking;

//Q:- Difference between equal and hashcode?

import java.util.ArrayList;

public class BitMask {

    public static void main(String[] args) {
        // oddEven(11);
        // int[] ar = {3, 3, 2, 2, 5, 5, 7, 6, 6};
        // unique(ar);
        System.out.println(setBitCount(5));
    }


    public static void oddEven(int n) {
        if ((n & 1) == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }


    public static void unique(int[] ar) {
        int m = ar[0];
        for (int i = 1; i < ar.length; i++) {
            m = m ^ ar[i];
        }
        System.out.println(m);
    }


    public static int setBitCount(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int setBit(int n, int i){
        int mask = 1<<i;
        return n|mask;
    }

    public static int offBit(int n, int i){
        int mask = ~(1<<i);
        return (n&mask);
    }

    public static int magicNumber(int n, int i){
        int mask = ~(1<<i);
        return (n&mask);
    }
}
