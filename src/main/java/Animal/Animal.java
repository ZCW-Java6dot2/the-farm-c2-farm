package Animal;

import Farm.Silo;
import Interfaces.Eater;
import Interfaces.Edible;
import Interfaces.NoiseMaker;

public abstract class Animal implements NoiseMaker, Eater {

    @Override
    public void eat(Edible food, int howMuchEaten, Silo silo) {
        for (int i = 0; i < howMuchEaten; i++) {
            if (food.equals("capsicum") && silo.getCapsicum().size() != 0) {
                silo.getCapsicum().remove(0);
            }
            if (food.equals("carrot") && silo.getCarrot().size() != 0) {
                silo.getCarrot().remove(0);
            }
            if (food.equals("Corn") && silo.getCorn().size() != 0) {
                silo.getCorn().remove(0);
            }
            if (food.equals("Wheat") && silo.getWheat().size() != 0) {
                silo.getWheat().remove(0);
            }
            if (food.equals("Tomato") && silo.getTomato().size() != 0) {
                silo.getTomato().remove(0);
            }
        }
    }



    @Override
    public String makeNoise() {
        return null;
    }
}
