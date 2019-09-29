package exercise.recursion.assignment;

/*
7. Take as input N, the size of array. Take N more inputs and store that in an array.
Take as input M, a number. Write a recursive function which returns true
if M is contained in the array and false otherwise. Print the value returned.
*/
public class CheckContainedNoInArray {

    public static void main(String[] args) {
      int[] ar = {1,2,3,4,5,6};
      int s = ar.length;
      int m = 6;
        System.out.println(isContainedNumber(ar,s,m));
    }

 public static boolean isContainedNumber(int[] ar,int s,int m){
        if(s == 0){
            if(ar[s] == m){
                return true;
            }else {
                return false;
            }
        }

        if(ar[s-1] == m){
            return true;
        }

        return isContainedNumber(ar,s-1,m);
 }
}
