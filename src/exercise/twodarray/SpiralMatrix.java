package exercise.twodarray;

public class SpiralMatrix {

    public static void main(String args[]) {
        int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        spiralPrint(a);
    }

    public static void spiralPrint(int ar[][]) {
        int bottom = ar.length;
        int right = ar.length;
        int i, top = 0, left = 0;
        while (top < bottom && left < right) {
            for (i = left; i < right; i++) {
                System.out.print(ar[top][i]);
            }
            top++;

            for (i = top; i < bottom; i++) {
                System.out.print(ar[i][right - 1]);
            }
            right--;
        }
    }
}
