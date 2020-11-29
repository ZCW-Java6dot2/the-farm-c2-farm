package Vehicle;

import Farm.Field;
import Farm.Silo;
import Interfaces.Flyable;
import Interfaces.Rideable;
import Person.Person;

public class CropDuster extends FarmVehicle implements Rideable, Flyable {

    public CropDuster(Person pilot, boolean mountDisMount) {
        super(pilot, mountDisMount);
    }

    @Override
    boolean operate(Field field, Silo silo) {
        if (flying() && !field.Fertilized) {
            field.setHasBeenFertilized(true);
        }
        return true;
    }

    @Override
    public Boolean flying() {
        return isMountDisMount();
    }

    @Override
    public String makeNoise() {
        return "Buzzzz whirrrrr";
    }

    @Override
    public Boolean mount(Person pilot) {
        setMountDisMount(true);
        return isMountDisMount();
    }

    @Override
    public Boolean dismount() {
        setMountDisMount(false);
        return isMountDisMount();
    }
}
