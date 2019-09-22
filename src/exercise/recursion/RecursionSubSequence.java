package exercise.recursion;

public class RecursionSubSequence {

    public static void main(String[] args) {
        subSequence("","abc");
       // asciiSubSequence("","abc");

    }

    public static void subSequence(String processed,String  unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        subSequence(processed+ch,unprocessed);
        subSequence(processed,unprocessed);
    }

    public static void asciiSubSequence(String processed,String  unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        asciiSubSequence(processed+(int)ch,unprocessed);
        asciiSubSequence(processed+ch,unprocessed);
        asciiSubSequence(processed,unprocessed);
    }
}
