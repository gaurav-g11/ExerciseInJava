package exercise.twodarray;

public class HorizontalWaveMatrix {
    public static void main(String[] args) {
       int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        printHorizontalWave(arr);
    }

    public static void printHorizontalWave(int[][] arr){
         for (int i=0;i<arr.length;i++){
             if(i%2==0){
                 for(int j = 0;j<arr[i].length;j++){
                     System.out.print(arr[i][j]+" ");
                 }
             }else{
                 for(int k=arr[i].length-1;k>=0;k--){
                     System.out.print(arr[i][k]+" ");
                 }
             }
         }
    }
}
