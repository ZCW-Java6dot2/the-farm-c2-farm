package Person;

import Animal.Animal;
import Interfaces.Produce;
import Interfaces.Rider;

public class Person extends Animal {
    public Person() {

    }


    public void eat() {

    }

    public String makeNoise() {
    return "talk talk";
    }


    @Override
    public void eat(Produce p) {

    }
}
