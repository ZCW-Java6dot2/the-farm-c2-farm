package Vehicle;

import Farm.Field;
import Interfaces.Flyable;
import Interfaces.Rideable;
import Person.Person;
import Person.Pilot;

public class CropDuster extends FarmVehicle implements Rideable, Flyable {
    private Pilot pilot;

    public CropDuster(Pilot pilot) {
        super(pilot, mountDisMount);
        this.pilot = pilot;
    }

    @Override
    boolean operate(Field field) {
        if(!field.hasBeenFertilized) {
            field.setHasBeenFertilized(true);
        }
        return true;
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
