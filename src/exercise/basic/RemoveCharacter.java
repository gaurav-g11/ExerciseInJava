package exercise.basic;

public class RemoveCharacter {

    public static void main(String[] args) {
        String s = "hi";
        int index = 0;
        removeCharater(s,index);
    }

    public static void removeCharater(String s,int index){
        if(s.length() == index){
            return;
        }

        char ch = s.charAt(index);
        if(ch == 'i'){
            System.out.println(s);
            return;
        }

        removeCharater(s,index+1);
    }
}
