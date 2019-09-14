package exercise.searching;

public class LinearSearch {

    public static void main(String args[]) {
        int element = 6;
        int[] ar = {1, 3, 4, 5, 6};
        System.out.println(linear(ar,element));
    }

    public static int linear(int ar[],int element){
        for (int i = 0; i < ar.length; i++) {
            if(element == ar[i]){
              return i;
            }
        }
        return -1;
    }
}
