package Vehicle;

import Farm.Field;
import Farm.Silo;
import Person.Person;

public abstract class FarmVehicle<T extends Person> extends Vehicle{
    protected Person person;
    protected boolean mountDisMount;

    public FarmVehicle(Person person, boolean mountDisMount) {
        this.person = person;
        this.mountDisMount = mountDisMount;
    }

    public boolean isMountDisMount() {
        return mountDisMount;
    }

    public void setMountDisMount(boolean mountDisMount) {
        this.mountDisMount = mountDisMount;
    }

    abstract boolean operate(Field field, Silo silo);
}
