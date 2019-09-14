package exercise.searching;

public class BinarySearch {

    public static void main(String args[]) {
        int[] ar = {1, 2, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(ar, 0, ar.length - 1, 8));
    }

    public static int binarySearch(int[] ar, int start, int end, int element) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (ar[mid] == element) {
                return mid;
            } else if (ar[mid] > element) {
                end = end - 1;
            } else if (ar[mid] < element) {
                end = end + 1;
            }
        }

        return -1;
    }
}
