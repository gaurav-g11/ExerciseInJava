package exercise.recursion.assignment;

import java.util.Scanner;

/*
6. Take as input N, the size of array. Take N more inputs and store that in an array.
Write a recursive function which returns true if the array is sorted and false otherwise.
Print the value returned.
*/
public class CheckSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        System.out.println(checkSortedArray(arr, n));
    }

    public static boolean checkSortedArray(int[] ar, int n) {
        if (n == 0 || n == 1) {
            return true;
        }

        if (ar[n - 1] < ar[n - 2]) {
            return false;
        }

        return checkSortedArray(ar, n - 1);
    }
}
