package Person;

import Interfaces.Botanist;
import Interfaces.Produce;
import Interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist {

    public void plant() {

    }

    @Override
    public void eat(Produce p) {

    }
}
