package Person;

import Animal.Animal;
import Farm.Silo;
import java.lang.String;

public class Person extends Animal {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String makeNoise() {
        return "talk talk";
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat(String food, int howMuchEaten, Silo silo) {
        super.eat(food, howMuchEaten, silo);
    }
}
