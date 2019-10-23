package exercise.oops;

public class Child {

    public static void main(String[] args) {
        Human mohit = new Human(10000);
        mohit.name = "Mohit";
        System.out.println(mohit.name);

        mohit.loan();
        mohit.loan();
        mohit.loan();

        Human rohit = new Human();
        rohit.name = "Rohit";
        System.out.println(rohit.balance);
    }
}
