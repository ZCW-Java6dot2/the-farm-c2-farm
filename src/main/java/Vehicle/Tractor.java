package Vehicle;

import Interfaces.FarmVehicle;
import Person.Person;

public class Tractor extends Vehicle implements FarmVehicle {


    public void operate() {
        //Will harvest
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
