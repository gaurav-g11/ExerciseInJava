package exercise.utils;

import java.util.Arrays;

public class Util {

    public static void main(String[] args) {
        int[] ar = {1, 2, 13, 4, 5};
        // System.out.println(Arrays.toString(ar));
        // swap(ar,0,4);
        // System.out.println(ar);
        System.out.println(findMaxElementIndex(ar));
    }

    public static void swap(int ar[], int firstIndex, int secondIndex) {
        int temp = ar[firstIndex];
        ar[firstIndex] = ar[secondIndex];
        ar[secondIndex] = temp;
    }

    public static int findMaxElement(int[] ar) {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

    public static int findMaxElementIndex(int[] ar) {
        int max = 0;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > ar[max]) {
                max = i;
            }
        }
        return max;
    }

}
