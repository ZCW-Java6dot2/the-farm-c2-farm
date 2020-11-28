package Vehicle;

import Farm.Field;
import Farm.Silo;
import Interfaces.Flyable;
import Interfaces.Rideable;
import Person.Person;
import Person.Pilot;

public class CropDuster extends FarmVehicle implements Rideable, Flyable {
    private Pilot pilot;

    public CropDuster(Pilot pilot) {
        this.pilot = pilot;
    }

    @Override
    boolean operate(Field field, Silo silo) {
        if (flying() && !field.hasBeenFertilized) {
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
