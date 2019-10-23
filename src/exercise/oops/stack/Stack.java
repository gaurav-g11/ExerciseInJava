package exercise.oops.stack;

public class Stack {
    public int data[];
    public int top = -1;
    public int DEFAULT_SIZE = 10;

    public Stack() {
        this.data = new int[DEFAULT_SIZE];

        isFull();
        isEmpty();
    }
    

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean push(int element) {
        if(isFull()){
            return false;
        }
        
        data[++top]=element;
        return true;
    }

    private boolean isEmpty() {
        return top == -1;
    }
    
    public int pop() throws Exception {
        if(isEmpty()){
           throw new Exception(("Khaali he be"))  ;
        }
        return data[top--];
    }

    public int peak() throws Exception {
        if(isEmpty()){
            throw new Exception(("Khaali he be"))  ;
        }
        return data[top];
    }

}
