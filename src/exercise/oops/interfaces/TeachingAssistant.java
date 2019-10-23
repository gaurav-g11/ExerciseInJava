package exercise.oops.interfaces;

public class TeachingAssistant implements Student,Teacher {

    @Override
    public void study() {
        System.out.println("I study more like a Student");
    }

    @Override
    public void teach() {
        System.out.println("I teach more like a Teacher");
    }

    @Override
    public void lecture() {
        System.out.println("I lecture more like a Teacher");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep more like a student");
    }
}
