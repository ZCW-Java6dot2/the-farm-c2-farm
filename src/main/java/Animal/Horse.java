package Animal;

import Farm.Silo;
import Interfaces.Edible;
import Interfaces.Produce;
import Interfaces.Rideable;
import Person.Person;

public class Horse extends Animal implements Rideable {
    Boolean mountDisMount;
    Person rider;

    public Person getRider() {
        return rider;
    }

    public void setRider(Person rider) {
        this.rider = rider;
    }

    public Boolean getMountDisMount() {
        return mountDisMount;
    }

    public void setMountDisMount(Boolean mountDisMount) {
        this.mountDisMount = mountDisMount;
    }

    public String makeNoise() {
     return "Neigh Neigh";
    }

    @Override
    public Boolean mount(Person p) {
        setMountDisMount(true);
        return this.mountDisMount;
    }

    @Override
    public Boolean dismount() {
        setMountDisMount(false);
        return this.mountDisMount;
    }

}
