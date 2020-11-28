package Vehicle;

import Farm.Field;
import Interfaces.Rideable;
import Person.Person;
import Person.Farmer;

public class Tractor extends FarmVehicle implements Rideable {
    private Farmer farmer;

    public Tractor(Farmer farmer) {
        this.farmer = farmer;
    }

    @Override
    boolean operate(Field field) {
        if(field.hasBeenFertilized) {
            field.setHasBeenHarvested(true);
        }

        return true;
    }

    @Override
    public String makeNoise() {

        return "hummmmmmmmmmmmmmmmmmm";
    }

    @Override
    public Boolean mount(Person farmer) {
        setMountDisMount(true);
        return isMountDisMount();
    }

    @Override
    public Boolean dismount() {
        setMountDisMount(false);
        return isMountDisMount();
    }
}
