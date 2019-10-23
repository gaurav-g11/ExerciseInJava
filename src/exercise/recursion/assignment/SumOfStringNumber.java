package exercise.recursion.assignment;


import java.util.Scanner;

/*
 1. Take as input str, a number in form of a string. Write a recursive function to find the sum of digits in the string.
 Print the value returned.
 */
public class SumOfStringNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sum(Integer.parseInt(str)));
    }

    public static int sum(int num){
        if(num ==0){
            return 0;
        }

        return num % 10 + sum(num/10);
    }
}
