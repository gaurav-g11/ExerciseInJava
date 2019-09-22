package exercise.twodarray;

public class SpiralMatrix {

    public static void main(String[] args) {
        int ar[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        printSpiralMatrix(ar);
    }

    public static void printSpiralMatrix(int[][] ar) {
        int left = 0;
        int right = ar[0].length - 1;
        int top = 0;
        int bottom = ar[0].length - 1;

        while (top<= right && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(ar[top][i]+" ");
            }
            top++;

            for (int j = top; j <= bottom; j++) {
                System.out.print(ar[j][right]+" ");
            }
            right--;

            for (int k = right; k >= left; k--) {
                System.out.print(ar[bottom][k]+" ");
            }
            bottom--;

            for (int l = bottom; l >= top; l--) {
                System.out.print(ar[l][left]+" ");
            }
            left++;
        }
    }
}
