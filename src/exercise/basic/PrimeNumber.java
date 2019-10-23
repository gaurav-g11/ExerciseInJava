package exercise.basic;

public class PrimeNumber {

    public static void main(String[] args) {

        withInRangePrimeNumber(2, 8);
        /*if(isPrime(2)) {
            System.out.println("Prime number");
        }else{
            System.out.println("Not prime number");
        }*/
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void withInRangePrimeNumber(int lowerLimit, int upperLimit) {
        for (int l = lowerLimit; l <= upperLimit; l++) {
            int flag = 1;
            for (int i = 2; i < l; i++) {
                if (l % i == 0) {
                    flag = 0;
                  break;
                }else{
                    flag = 1;
                }
            }
            if(flag == 1){
                System.out.print(l+" ");
            }
        }
    }

    private static void primeNumber(int num){

    }
}
