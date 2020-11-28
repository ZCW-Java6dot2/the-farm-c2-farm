package Vehicle;

import Farm.Field;
import Interfaces.Rideable;

public class Tractor extends FarmVehicle implements Rideable {
import Person.Person;


    @Override
    boolean operate(Field field) {
        return false;
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public Boolean mount(Person p) {
        return null;
    }

    @Override
    public Boolean dismount(Person p) {
        return null;
    }
}
