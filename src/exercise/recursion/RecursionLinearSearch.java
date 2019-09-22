package exercise.recursion;

public class RecursionLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4};
        System.out.println(linearSearch(arr,0,3));
    }

    public static boolean linearSearch(int[] arr,int index,int element){
        if(index == arr.length){
            return false;
        }

        if(arr[index]== element){
            return true;
        }

        return linearSearch(arr,index+1,element);
    }
}
