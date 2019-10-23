package exercise.oops.custom_arraylist;

public class CustomArrayList {
    private int[] data;
    private int size = 0;
    private int DEFAULT_SIZE = 10;

    CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int value){
        if (isFull()) {
           resize();
        }
        data[size++]=value;
    }

    private void resize() {
        int temp[] = new int[data.length*2];

        for(int i=0; i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index,int value){
        data[index]=value;
    }

    public int remove(){
       return data[--size];
    }
}
