package exercise.programs;

import java.util.Scanner;

public class CheckSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfInput = sc.nextInt();
        int[] ar = new int[numberOfInput];
        for(int i=0;i<numberOfInput;i++){
            ar[i] = sc.nextInt();
        }
        System.out.println(isSorted(ar));
    }

    private static boolean isSorted(int[] ar){
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i] > ar[i+1]){
                return false;
            }
        }
        return true;
    }
}
