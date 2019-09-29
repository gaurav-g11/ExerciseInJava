package exercise.string;

import java.util.Arrays;

public class Frequency {

    public static void main(String[] args) {
        String str = "aaabbc";
        int[] freq = frequency(str);
        System.out.println(Arrays.toString(freq));
    }

    private static int[] frequency(String str){
        int[] arr = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            arr[ch-'a']++;
        }
        return arr;
    }
}
