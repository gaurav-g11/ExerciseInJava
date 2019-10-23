package exercise.oops.custom_arraylist;

public class ArrayListClient {

    public static void main(String[] args) {
        CustomArrayList cal = new CustomArrayList();

        for(int i=0;i<12;i++){
            cal.add(i);
            System.out.println("added : "+cal.get(i));
        }

        for(int i=0;i<10;i++){
            System.out.println("removed : "+cal.remove());
        }
    }
}
