package exercise.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] ar = {5,4,9,7,2};
        System.out.println(Arrays.toString(mergeSort(ar)));

    }

    public static int[] mergeSort(int[] ar) {
        if (ar.length == 1) {
            return ar;
        }
        int mid = ar.length / 2;
        int first[] = mergeSort(Arrays.copyOfRange(ar, 0, mid));
        int second[] = mergeSort(Arrays.copyOfRange(ar, mid, ar.length));

        return merge(first, second);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
                k++;
            } else {
                mix[k] = second[j];
                j++;
                k++;
            }
        }

        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}
