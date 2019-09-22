package exercise.string;

public class Frequency {

    public static void main(String[] args) {
        String str = "aaabbc";
        int[] freq = frequency(str);
        for(int i=0;i<freq.length;i++){
             if(freq[i] > 0){
                 System.out.print('a'+i);
             }else{
                // System.out.print(freq[i]);
             }
        }
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
