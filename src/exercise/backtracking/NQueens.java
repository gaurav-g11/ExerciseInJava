package exercise.backtracking;

public class NQueens {

    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];

       /* for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++) //or //for(int j=0;j<board.length;j++)
            {
                System.out.println(board[i][j]);
            }
        }*/

       nQueens(board,0);
    }

    private static void nQueens(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            return;
        }

        for(int col=0;col < board.length;col++){
            if(isSafe(board,row,col)){
              board[row][col] = true;
              nQueens(board,row+1);
              board[row][col]=false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        for(int i = 0; i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        int left = min(row,col);
        for(int i=0;i<=left;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int right = min(row,board.length-col-1);
        for(int i=1;i<=right;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++) //or //for(int j=0;j<board.length;j++)
            {
                if(board[i][j]){
                    System.out.print("Q");
                }else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
}
