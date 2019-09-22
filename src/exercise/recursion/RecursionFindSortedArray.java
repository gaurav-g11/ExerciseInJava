package exercise.recursion;

public class RecursionFindSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,5,4};
        System.out.println(findSorted(arr,0));
    }

    public static boolean findSorted(int[] arr,int index){
        if(index == arr.length-1){
            return true;
        }

        if(arr[index] > arr[index+1]){
            return false;
        }

        return findSorted(arr,index+1);
    }

}
