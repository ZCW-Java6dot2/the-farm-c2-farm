package Person;

import Animal.Animal;
import Interfaces.Produce;

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


    @Override
    public void eat(Produce p) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
