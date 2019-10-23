package exercise.recursion;

public class RecursionMazePath {

    public static void main(String[] args) {
        // mazePath(3,3,"");
        System.out.println(mazePathCount(3,3,""));
    }

    public static void mazePath(int row,int col,String processed){
        if(row == 1 && col == 1){
            System.out.println(processed);
            return;
        }

        if(row > 1){
            mazePath(row-1,col,processed+"V");// V means Vertical
        }

        if(col > 1){
            mazePath(row,col-1,processed+"H");// H means Vertical
        }
    }

    public static int mazePathCount(int row,int col,String processed){
        if(row == 1 && col == 1){
            System.out.println(processed);
            return 1;
        }
        int count = 0;
        if(row > 1){
            count+= mazePathCount(row-1,col,processed+"V");// V means Vertical
        }

        if(col > 1){
            count+= mazePathCount(row,col-1,processed+"H");// H means Vertical
        }
        return count;
    }
}
