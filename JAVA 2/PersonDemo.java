abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    // Abstract methods
    public abstract void eat();
    public abstract void exercise();

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Athlete extends Person {
    public Athlete(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating a balanced diet with a focus on protein.");
    }

    @Override
    public void exercise() {
        System.out.println(name + " is doing intense workouts and training regularly.");
    }
}

class LazyPerson extends Person {
    public LazyPerson(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " is enjoying some fast food and snacks.");
    }

    @Override
    public void exercise() {
        System.out.println(name + " avoids exercising and prefers a sedentary lifestyle.");
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Athlete athlete = new Athlete("A!");
        LazyPerson lazyPerson = new LazyPerson("A@");

        athlete.eat();
        athlete.exercise();
        athlete.sleep();

        System.out.println(); // Adding a line break for clarity

        lazyPerson.eat();
        lazyPerson.exercise();
        lazyPerson.sleep();
    }
}