package exercise.array;

import java.util.Arrays;

//Given two array, merge the  both array and sort it.
public class Algo {

    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int[] arr = {6,7,8,9,10};

        mergeArray(ar,arr);
    }

    private static void mergeArray(int[] a,int[] b){
        int totalLength = a.length + b.length;
        int[] newArr = new int[totalLength];
        int pos=0;
        for(int i=0;i<a.length;i++){
            newArr[pos] = a[i];
            pos++;
        }
        for(int j=0;j<b.length;j++){
            newArr[pos] = b[j];
            pos++;
        }
        System.out.print(Arrays.toString(newArr));
    }
}
