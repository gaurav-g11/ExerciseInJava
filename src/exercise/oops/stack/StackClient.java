package exercise.oops.stack;

import exercise.oops.stack.Stack;

public class StackClient {

    public static void main(String[] args) {
       /* int[] ar = {1,2,3,4,5};
        Stack stack = new Stack();
        stack.push(6);*/

       DynamicStack stack = new DynamicStack();
       for(int i=0;i<15;i++){
           stack.push(i);
       }

       for (int i=0;i<10;i++){
           try {
               stack.pop();
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
    }
}
