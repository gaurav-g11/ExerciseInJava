package exercise.conversion;

import java.util.Scanner;

public class InverseNumber {

    public static void main(String args[]){
       // System.out.print("Enter number :");
      //  Scanner sc = new Scanner(System.in);
      //  int n = sc.nextInt();
        System.out.println(inverse(53124));
    }


    public static int inverse(int n){
        int inv = 0;
        int place = 1;

        while(n!=0){
            int value = n % 10;
            n= n/10;
            inv = (int)(inv+place*Math.pow(10,value-1));
            place = place + 1;
        }
       return inv;
    }

}
