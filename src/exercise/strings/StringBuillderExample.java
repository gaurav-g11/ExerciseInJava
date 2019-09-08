package exercise.strings;

public class StringBuillderExample {

    public static void main(String args[]){
        String s = "HellO";
        toggle(s);
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
}
