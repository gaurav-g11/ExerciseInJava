package exercise.recursion.assignment;

public class SearchFromFirstIndexInArray {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 4, 5};
        int s = 0;
        int m = 5;
        System.out.println(searchFromFirstIndexInArray(arr,s,m));
    }

    public static int searchFromFirstIndexInArray(int[] ar, int s, int m) {
        if(ar.length == s){
            return -1;
        }
        if(ar[s] == m){
            return s;
        }
        return searchFromFirstIndexInArray(ar,s+1,m);
    }
}
