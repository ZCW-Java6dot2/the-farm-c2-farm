package Vehicle;

import Farm.Field;
import Farm.Silo;
import Interfaces.Rideable;
import Person.Person;
import Person.Farmer;

public class Tractor extends FarmVehicle implements Rideable {
    private Farmer farmer;

    public Tractor(Farmer farmer) {
        this.farmer = farmer;
    }

    @Override
    boolean operate(Field field, Silo silo) {
        if(isMountDisMount() && field.hasBeenFertilized) {
            field.setHasBeenHarvested(true);
            field.yield(silo);
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
