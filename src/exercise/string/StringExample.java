package exercise.string;

public class StringExample {

    public static void main(String args[]) {
         String s = "Helloooool";

        // System.out.println('h'+0);

        ascciDifferenceCharacter("abc");//output: a2c3f

      //  subString("Hello");

      //  System.out.println(s.indexOf('l',3));
       // System.out.println(s.charAt(0));
       // System.out.println(s.substring(0,s.length()-(s.length()-1)));
    }

    public static void subString(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                System.out.println(s.substring(i, j));
            }
        }
    }

    public static boolean pallindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        return true;
    }

    public static void ascciDifferenceCharacter(String s) {
        int length = s.length();
        int diff;
        for (int i = 0; i < length; i++) {
            System.out.print(s.charAt(i));
            if(i==length-1) {
                break;
            }
            diff = (s.charAt(i+1) - s.charAt(i));
            System.out.print(diff);
        }
    }
}
