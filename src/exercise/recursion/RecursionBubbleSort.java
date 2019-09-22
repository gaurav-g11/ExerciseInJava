package exercise.recursion;

import java.util.Arrays;

public class RecursionBubbleSort {

    public static void main(String[] args) {
        int[] ar = {5,4,3,2,1};
        bubbleSort(ar,ar.length-1,0);
        System.out.println(Arrays.toString(ar));

        //Both are meaning same of the above line of code and
        // you can also use for-loop for print sorted array like below line of code.
       /* for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]);
        }*/
    }

    public static void bubbleSort(int[] ar,int row,int col){
         if(row == 0){
             return;
         }
         if(row == col){
             bubbleSort(ar,row-1,0);
             return;
         }
        if(ar[col] > ar[col+1]){
            int temp = ar[col];
            ar[col]=ar[col+1];
            ar[col+1]=temp;
        }
        bubbleSort(ar,row,col+1);
    }
}
