package exercise.sorting;



public class SelectionSort {

    public static void main(String[] args) {
        int[] ar = {38, 52, 9, 18, 6, 62, 13};
        selectionSort(ar);
        for (int k = 0; k < ar.length; k++) {
            System.out.print(ar[k] + " ");
        }
        //(OR)
        //System.out.println(Arrays.toString(ar));
    }

    private static void selectionSort(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            int min = i;
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[min]) {
                    min = j;
                }
            }

            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }

    }
}
