package Vehicle;

import Farm.Field;
import Interfaces.Rideable;
import Person.Person;

public class Tractor extends FarmVehicle implements Rideable {
    private Person person;

    @Override
    boolean operate(Field field) {
        return false;
    }

    @Override
    public String makeNoise() {
        return "hummmmmmmmmmmmmmmmmmm";
    }

    @Override
    public Boolean mount(Person p) {
        return null;
    }

    @Override
    public Boolean dismount() {
        return null;
    }
}
