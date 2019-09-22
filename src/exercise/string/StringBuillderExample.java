package exercise.string;

public class StringBuillderExample {

    public static void main(String args[]){
        String s = "aec";
        //toggle(s);
        ascciDifferenceCharacterUsingStringBuilder(s);
       // System.out.println(s);
    }

    public static void toggle(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length();i++){
            char ch = sb.charAt(i);

            if(ch>='a' && ch <= 'z'){
                ch=(char)('A'+(ch-'a'));
            }else{
                ch = (char)('a'+(ch-'A'));
            }
            sb.setCharAt(i,ch);
        }
        System.out.println(sb);
    }


    public static void StringBuilderExample(StringBuilder sb){
        for(int i = 0; i < 100000000; i++){
            sb.append("a");
        }
        System.out.println(sb);
    }

    public static void ascciDifferenceCharacterUsingStringBuilder(String s) {
        StringBuilder builder = new StringBuilder();
        builder.append(s.charAt(0));
        int length = s.length();
        for (int i = 1; i < length; i++) {
           char ch = s.charAt(i);
           char ch1 = s.charAt(i-1);

           int diff = Math.abs(ch-ch1);
           builder.append(diff);
           builder.append(ch);
        }

        System.out.println(builder);
    }
}
