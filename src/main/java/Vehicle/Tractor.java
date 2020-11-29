package Vehicle;

import Farm.Field;
import Farm.Silo;
import Interfaces.Rideable;
import Person.Farmer;
import Person.Person;

public class Tractor extends FarmVehicle implements Rideable {
    private Farmer farmer;

    public Tractor(Person farmer, boolean mountDisMount) {
        super(farmer, mountDisMount);
    }

    @Override
    public boolean operate(Field field, Silo silo) {
        if(isMountDisMount() && field.Fertilized) {
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
