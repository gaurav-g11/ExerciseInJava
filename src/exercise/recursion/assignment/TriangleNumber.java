package exercise.recursion.assignment;

import java.util.Scanner;

/*
5. Take as input N, a number. Write a recursive function to find Nth triangle
where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6,
so on and so forth. Print the value returned.
*/
public class TriangleNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(triangleNumberWithRecursion(n));
       // System.out.println(triangleWithoutRecursion(n));
    }

    public static int triangleNumberWithRecursion(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + triangleNumberWithRecursion(n-1);
    }


    public static int triangleWithoutRecursion(int n) {
        if (n <= 0) {
            return 0;
        }
         int sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }

        return sum;
    }

}
