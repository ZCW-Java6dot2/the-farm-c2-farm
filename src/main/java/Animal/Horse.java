package Animal;

import Farm.Silo;
import java.lang.String;
import Interfaces.Rideable;
import Person.Person;

public class Horse extends Animal implements Rideable {
    private Boolean mountDisMount;
    private Person rider;
    private Boolean riddenToday;

    public Horse() {
        this.riddenToday = false;
    }

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

    public String rideHorse() {
        this.riddenToday = true;
        return "Horse has been ridden";
    }

    public Boolean getRiddenToday() {
        return this.riddenToday;
    }

    @Override
    public void eat(String food, int howMuchEaten, Silo silo) {
        super.eat(food, howMuchEaten, silo);
    }
}
