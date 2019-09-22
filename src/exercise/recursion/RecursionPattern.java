package exercise.recursion;

public class RecursionPattern {

    public static void main(String[] args) {
        //patternLeft(4,0);
        patternRight(4,0);
    }

    public static void patternLeft(int row,int col){
        if(row == 0){
            return;
        }

        if(row == col){
            patternLeft(row-1,0);
            System.out.println();
            return;
        }
        patternLeft(row,col+1);
        System.out.print("*");
    }

    public static void patternRight(int row,int col){
        if(row == 0){
            return;
        }

        if(row == col){
            System.out.println();
            patternRight(row-1,0);
            return;
        }

        System.out.print("*");
        patternRight(row,col+1);
    }
}
