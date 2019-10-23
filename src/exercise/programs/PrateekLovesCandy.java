package exercise.programs;

import java.util.Scanner;

/*
Q:- Prateek recently graduated from college. To celebrate, he went to a candy shop and bought all the candies. The total cost was a number upto which there are n prime numbers (starting from 2). Since Prateek wants to minimize his cost, he calls you to help him find the minimum amount that needs to be paid. Being a student of Prateek bhaiya it is now your job to help him out :)

Input Format
First line contains a single integer denoting the number of test cases T. Next T lines contains a single integer N, denoting the number of primes required.

Constraints
T <= 10000

It is guaranteed that the answer does not exceed 10^6.

Output Format
Print the minimum cost that needs to be paid.

Sample Input
2
5
1
Sample Output
11
2
Explanation
In the first case there are 5 primes upto 11(2,3,5,7,11).
*/
public class PrateekLovesCandy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            arr[i] = l;
        }

        for(int i=0;i<arr.length;i++) {
            lovesCandy(arr[i]);
            //sieveOfEratosthenes(arr[i]);
        }
    }

    private static void lovesCandy(int num) {
        int count = 1;

        for (int n = 2; n <= 10000; n++) {
            int temp = 0;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    temp = temp + 1;
                }
            }


            if (temp == 0) {
                count++;
            }

            if (count == num + 1) {
                System.out.println(n);
                break;
            }

        }
    }


    private static void sieveOfEratosthenes(int n)
    {
        // Create a boolean array "prime[0..n]" and initialize
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<n;i++)
            prime[i] = true;

        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true)
                System.out.print(i + " ");
        }
    }
}



