package exercise.recursion;

public class RecursionExample {

    public static void main(String args[]) {

        p4();
       // printRecursion(4);
    }

    public static void printRecursion(int n){
        if(n == 0){return;}
        System.out.println("aa rha hun : "+n);
        printRecursion(n-1);
        System.out.println("jaa rha hun : "+n);
    }

    public static void p4() {
        System.out.println("aa rha hun : "+4);
        p3();
        System.out.println("Jaa rha hun : "+4);
    }

    public static void p3() {
        System.out.println("aa rha hun : "+3);
        p2();
        System.out.println("Jaa rha hun : "+3);
    }

    public static void p2() {
        System.out.println("aa rha hun : "+2);
        p1();
        System.out.println("Jaa rha hun : "+2);
    }

    public static void p1() {
        System.out.println("aa rha hun : "+1);
        p0();
        System.out.println("Jaa rha hun : "+1);
    }

    public static void p0() {
        return;
    }
}
