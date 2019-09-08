package exercise.programs;

import java.util.Scanner;

public class SquareRoot {

    public static void main(String args[]){
          Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
          int n = s.nextInt();
        //  System.out.println("Square root is : "+sqrt(n)); // With Int Value
          System.out.println("Square root is : "+precision(n)); // With Float Value
    }

    public static int sqrt(int n){
         int start = 0;
         int end = n;
         int ans = 0;
         while (start <= end){
             int mid = (start + end)/2;

             if(mid * mid == n){
                 return mid;
             }

             else if(mid * mid < n){
                 ans = mid;
                 start = mid + 1;
             }

             else{
                 end = mid -1;
             }
         }


        return ans;
    }

    public static float precision(int n){
        float ans = sqrt(n);
        float f = 0.1f;
        for(int i=0; i < 4; i++){
            while(ans * ans <= n){
                ans = ans + f;
            }

            ans = ans -f;
            f= f/10;
        }

        return ans;
    }
}
