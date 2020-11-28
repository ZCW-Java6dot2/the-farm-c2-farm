package Vehicle;

import Farm.Farm;
import Person.Farmer;
import Farm.Field;

public abstract class FarmVehicle extends Vehicle{
    Farm farm;
    Farmer farmer;

    abstract boolean operate(Field field);
}
