package exercise.basic;

public class ArmstrongNumber {

    public static void main(String[] args) {

        withInRangeArmstrongNumber(1, 1000);

       /* if(isArmstrongNo(371)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }*/
    }

    public static boolean isArmstrongNo(int num) {
        int t1 = num;
        int length = 0;
        while (t1 != 0) {
            t1 = t1 / 10;
            length = length + 1;
        }
        int t2 = num;
        int rem;
        int arm = 0;
        while (t2 != 0) {
            rem = t2 % 10;
            int mul = 1;
            for (int i = 1; i <= length; i++) {
                mul = mul * rem;
            }

            arm = arm + mul;
            t2 = t2 / 10;
        }
        // System.out.println(arm);
        if (num == arm) {
            return true;
        } else {
            return false;
        }
    }


    public static void withInRangeArmstrongNumber(int lowerLimit, int upperLimit) {
        for (int l = lowerLimit; l <= upperLimit; l++) {
            int t1 = l;
            int length = 0;
            while (t1 != 0) {
                t1 = t1 / 10;
                length = length + 1;
            }

            int t2 = l;
            int rem;
            int arm = 0;
            while (t2 != 0) {
                rem = t2 % 10;
                int mul = 1;
                for (int i = 0; i < length; i++) {
                    mul = mul * rem;
                }
                arm = arm + mul;
                t2 = t2 / 10;
            }

            if (l == arm) {
                System.out.print(arm + " ");
            }
        }
    }
}
