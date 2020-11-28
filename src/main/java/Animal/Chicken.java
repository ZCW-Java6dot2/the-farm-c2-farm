package Animal;

import Interfaces.Produce;

public class Chicken extends Animal implements Produce {
    public void eat() {

    }

    public String makeNoise() {
        return "buk buk";

    }

    public void yield() {

    }

    public void hasBeenFertilized() {

    }

    @Override
    public void eat(Produce p) {

    }
}
