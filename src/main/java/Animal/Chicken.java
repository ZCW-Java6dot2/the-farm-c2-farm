package Animal;

import Farm.Silo;
import Interfaces.Produce;

public class Chicken extends Animal implements Produce {

    public String makeNoise() {
        return "buk buk";

    }

    public void yield() {

    }

    public void hasBeenFertilized() {

    }

    @Override
    public void yield(Silo silo) {

    }
}
