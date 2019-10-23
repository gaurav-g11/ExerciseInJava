package exercise.oops.interfaces;

public class JavaTeacher implements Teacher {
    @Override
    public void study() {
        System.out.println("I study like a java Teacher");
    }

    @Override
    public void teach() {
        System.out.println("I teach like a good Teacher");
    }

    @Override
    public void lecture() {
        System.out.println("Lecture");
    }
}
