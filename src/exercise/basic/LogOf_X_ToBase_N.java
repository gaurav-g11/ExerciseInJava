package exercise.basic;

public class LogOf_X_ToBase_N {

    public static void main(String[] args) {
        System.out.println(logOfXBaseN(1000,10));
    }

    public static int logOfXBaseN(int X,int N){
        int result = 0;
        int y = N;
        while (y <= X){
            y = y * N;
            result= result + 1;
        }
        return result;
    }
}
