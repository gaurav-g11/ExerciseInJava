package exercise.strings;

public class StringExample {

    public static void main(String args[]) {
        String s = "Hello";

        System.out.println('h'+0);
    }

    public static void subString(String s){
        for(int i =0 ; i < s.length(); i++){
            for(int j = i +1;j <= s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }

    public static boolean pallindrome(String s){
         int start = 0;
         int end = s.length()-1;

         while (start < end){
             if(s.charAt(start) != s.charAt(end)){
                 return false;
             }else{
                 start++;
                 end--;
             }
         }

         return true;
    }
}
