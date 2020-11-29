package Person;

import Animal.Animal;

public class Person extends Animal {
    private String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public void eat() {

    }

    public String makeNoise() {
        return "talk talk";
    }

    public String getName() {
        return name;
    }

}
