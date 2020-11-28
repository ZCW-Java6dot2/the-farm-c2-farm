package Person;

import Interfaces.Flyer;

public class Pilot extends Person implements Flyer {

    public Pilot(String name) {
        super(name);
    }

    @Override
    public void fly() {

    }
}
