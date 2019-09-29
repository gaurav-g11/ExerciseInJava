package exercise.basic;

/* Check whether a number is even or odd using if else statement. */
public class EvenOrOddNumber {

    public static void main(String[] args) {
        checkEvenOrOdd(5);
        usingTernaryOperatorCheckEvenOrOdd(3);
    }

    public static void checkEvenOrOdd(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }


    /* Check whether a number is even or odd using ternary operator. */
    public static void usingTernaryOperatorCheckEvenOrOdd(int n) {
        String result = (n % 2 == 0) ? n + " is even" : n + " is odd";
        System.out.println(result);
    }
}
