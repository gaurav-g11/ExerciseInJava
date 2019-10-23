package exercise.oops;

public class Human {
    String name;
    int balance;

    public Human(){
        this(1000);
        balance = 10000;
    }

    public Human(int balance){
        this("Anonymous",balance);
    }

    public Human(String name,int balance){
        this.name = name;
        this.balance = balance;
    }

    public void loan() {
        int t = balance / 10;
        balance = balance - t;

        System.out.println("Haan me gareeb ho gya "+balance);
    }

    public void eat(){
        if(balance < 100){
            System.out.println("Bhag yha se");
            return;
        }

        balance = balance -100;
        System.out.println("Mujhe khane do");
    }

    public static void fest(){
        System.out.println("Hurray Hurray");

    }
}
