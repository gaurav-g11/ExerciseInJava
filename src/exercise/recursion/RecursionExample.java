package exercise.recursion;

public class RecursionExample {

    public static void main(String[] args) {
        printRecursion(4);
    }

    public static void printRecursion(int n){
        if(n == 0){return;}
        //For print decrement order
        System.out.println("aa rha hun : "+n);
        printRecursion(n-1);
        //For print increment order
        System.out.println("jaa rha hun : "+n);
    }
}
