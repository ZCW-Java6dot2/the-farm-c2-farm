package Animal;

import Farm.Silo;
import java.lang.String;
import Interfaces.Produce;
import Items.Egg;

public class Chicken extends Animal implements Produce {

    private boolean fertilized;

    public Chicken(boolean fertilized) {
        this.fertilized = false;
    }

    public String makeNoise() {
        return "buk buk";

    }

    public boolean rooster() {
        this.fertilized = true;
        return true;
    }

    public boolean isFertilized() {
        return fertilized;
    }

    @Override
    public boolean yield(Silo silo) {
        int averageNumOfEggsPerDay = 15;
        rooster();
        for (int i = 0; i < averageNumOfEggsPerDay; i++) {
            silo.getEgg().add(new Egg());
        }
        return true;
    }

    @Override
    public void eat(String food, int howMuchEaten, Silo silo) {
        super.eat(food, howMuchEaten, silo);
    }
}
