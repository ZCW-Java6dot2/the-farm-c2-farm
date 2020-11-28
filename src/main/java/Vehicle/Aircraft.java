package Vehicle;

import Interfaces.Flyable;
import Person.Person;

public class Aircraft extends Vehicle implements Flyable {

    public void fly() {

    }

    @Override
    public Boolean mount(Person p) {
        return null;
    }

    @Override
    public Boolean dismount(Person p) {
        return null;
    }
}
