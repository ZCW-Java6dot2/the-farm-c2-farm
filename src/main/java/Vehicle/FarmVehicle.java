package Vehicle;

import Farm.Field;
import Person.Person;

public abstract class FarmVehicle<T extends Person> extends Vehicle{
    protected static Person person;
    protected static boolean mountDisMount;

    public FarmVehicle() {
        this.person = null;
        this.mountDisMount = false;
    }

    public FarmVehicle(Person person, boolean mountDisMount) {
        this.person = person;
        this.mountDisMount = mountDisMount;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public boolean isMountDisMount() {
        return mountDisMount;
    }

    public void setMountDisMount(boolean mountDisMount) {
        this.mountDisMount = mountDisMount;
    }

    abstract boolean operate(Field field);
}
