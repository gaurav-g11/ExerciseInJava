package exercise.sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] ar = {5, 4, 9, 7, 6};
        quickSort(ar, 0, ar.length);
    }

    private static void quickSort(int[] ar, int start, int end) {
        if (end <= start) {
            return;
        }

        int pivot = end - 1;
        pivot = pivotAdjust(ar, start, pivot);

        quickSort(ar, start, pivot);
        quickSort(ar, pivot + 1, end);
    }

    public static int pivotAdjust(int[] ar, int start, int pivot) {
        int j = start;

        for (int i = start; i < pivot; i++) {
            if (ar[i] < ar[pivot]) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;

                // swap(ar, ar[start], ar[i]);
                j++;
            }
        }
        //swap(ar, ar[j], ar[pivot]);
        int temp = ar[pivot];
        ar[pivot] = ar[j];
        ar[j] = temp;
        return j;
    }

   /* private static void swap(int ar[], int a, int b) {
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }*/
}
