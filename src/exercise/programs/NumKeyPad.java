package exercise.programs;

public class NumKeyPad {

    public static void main(String[] args) {
        numPad("","12");
    }

    private static void numPad(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit = unprocessed.charAt(0)-'0';
       // unprocessed = unprocessed.substring(1);
        for(int i = (digit-1)*3;i<digit*3;i++){
            if(i==26){
                continue;
            }
            char ch = (char)(i+'a');
           // numPad(processed+ch,unprocessed);
            numPad(processed+ch,unprocessed.substring(1));
        }
    }
}
