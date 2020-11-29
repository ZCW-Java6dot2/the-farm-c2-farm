package Animal;

import Farm.Silo;
import Interfaces.Eater;
import java.lang.String;
import Interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {

    @Override
    public void eat(String food, int howMuchEaten, Silo silo) {
        for (int i = 0; i < howMuchEaten; i++) {
            if (food.equalsIgnoreCase("capsicum") && silo.getCapsicum().size() != 0) {
                silo.getCapsicum().remove(0);
            }
            if (food.equalsIgnoreCase("carrot") && silo.getCarrot().size() != 0) {
                silo.getCarrot().remove(0);
            }
            if (food.equalsIgnoreCase("Corn") && silo.getCorn().size() != 0) {
                silo.getCorn().remove(0);
            }
            if (food.equalsIgnoreCase("Wheat") && silo.getWheat().size() != 0) {
                silo.getWheat().remove(0);
            }
            if (food.equalsIgnoreCase("Tomato") && silo.getTomato().size() != 0) {
                silo.getTomato().remove(0);
            }
            if (food.equalsIgnoreCase("Egg") && silo.getEgg().size() != 0) {
                silo.getEgg().remove(0);
            }
        }
    }


    @Override
    public String makeNoise() {
        return null;
    }
}
