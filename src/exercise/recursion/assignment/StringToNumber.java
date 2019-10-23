package exercise.recursion.assignment;

import java.util.Scanner;

/*
2. Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form.
 E.g. for “1234” return 1234. Print the value returned.
 */
public class StringToNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strNumber = sc.nextLine();

       // System.out.println(printToNumber(strNumber,0);
        printToNumber(strNumber,0);
    }

    private static void printToNumber(String num, int index){
        if(num.length()== index){
            return;
        }
        char ch = num.charAt(index);
        int s=ch-'0';
        System.out.print(s);
        printToNumber(num,index+1);
    }
}


//  return num.charAt(0)-'0';