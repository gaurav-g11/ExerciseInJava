package exercise.basic;

public class Pattern {

    public static void main(String[] args) {
        printPattern3(5);
    }

    /*
     Pattern 1:-
     *
     * *
     * * *
     * * * *
     * * * * *
                     */
    public static void printPattern1(int n) {
       for(int i = 1;i<=n;i++){
           for(int j = 1;j<=i;j++){
               System.out.print(" * ");
           }
           System.out.println();
       }
    }

    /*
     Pattern 2:-
     * * * * *
     * * * *
     * * *
     * *
     *
                     */
    public static void printPattern2(int n) {
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    /*
    Pattern 3:-
    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
                */
    public static void printPattern3(int n) {
           for(int i=1;i<=n;i++){
               for(int j = 1;j<=i;j++){
                   System.out.print(" * ");
               }
               System.out.println();
           }

           for(int i = 1;i<=n;i++){
               for(int j=n-1;j>=i;j--){
                   System.out.print(" * ");
               }
               System.out.println();
           }
    }

     /*
     Pattern 4:-
             *
           * *
         * * *
       * * * *
     * * * * *
                   */
     public static void printPattern4(int n){

     }

    /*
     Pattern 5:-
     * * * * *
       * * * *
         * * *
           * *
             *
                */


}
