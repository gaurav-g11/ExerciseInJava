
package exercise.recursion.assignment;

public class SearchFromLastIndexInArray {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5, 5,5};
        int s = ar.length - 1;
        int m = 5;

        System.out.println(searchFromLastIndexInArray(ar, s, m));
    }

    public static int searchFromLastIndexInArray(int[] ar, int s, int m) {
        if (s == 0) {
            if (ar[s] == m) {
                return s;
            } else {
                return -1;
            }
        }
        if (ar[s] == m) {
            return s;
        }
        return searchFromLastIndexInArray(ar, s - 1, m);
    }
}
