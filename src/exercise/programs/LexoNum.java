package exercise.programs;

public class LexoNum {

    public static void main(String[] args) {
        lexoNum(0, 100);
    }

    private static void lexoNum(int digit, int target) {
        if (digit > target) {
            return;
        }
        System.out.println(digit);
        for (int i = 0; i < 10; i++) {
            if (digit == 0 && i == 0) {
                continue;
            }
            lexoNum(digit * 10 + i, target);
        }
    }
}
