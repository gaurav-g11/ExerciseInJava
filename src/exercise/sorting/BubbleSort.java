package exercise.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String args[]){
        int[] ar = {5,4,3,2,1};
        bubbleSort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubbleSort(int ar[]){

        for(int i=0;i<ar.length;i++){
            int flag = 0;
            for(int j=0;j < ar.length-1-i;j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                    flag = 1;
                }
            }
            if(flag == 0){
               break;
            }
        }
    }
}
