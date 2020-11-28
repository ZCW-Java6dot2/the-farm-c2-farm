package Vehicle;

import Farm.Field;
import Interfaces.Flyable;
import Interfaces.Rideable;

public class CropDuster extends FarmVehicle implements Rideable, Flyable {


    @Override
    boolean operate(Field field) {
        return false;
    }

    @Override
    public void makeNoise() {

    }
}
