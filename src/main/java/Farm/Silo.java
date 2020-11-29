package Farm;

import Items.*;

import java.util.ArrayList;
import java.util.List;

public class Silo {
    List<Capsicum> capsicum;
    List<Carrot> carrot;
    List<EarCorn> corn;
    List<EarOfWheat> wheat;
    List<Egg> egg;
    List<Tomato> tomato;

    public Silo() {
        capsicum = new ArrayList<>(0);
        carrot = new ArrayList<>(0);
        corn = new ArrayList<>(0);
        wheat = new ArrayList<>(0);
        egg = new ArrayList<>(0);
        tomato = new ArrayList<>(0);
    }

    public List<Capsicum> getCapsicum() {
        return capsicum;
    }

    public List<Carrot> getCarrot() {
        return carrot;
    }

    public List<EarCorn> getCorn() {
        return corn;
    }

    public List<EarOfWheat> getWheat() {
        return wheat;
    }

    public List<Egg> getEgg() {
        return egg;
    }

    public List<Tomato> getTomato() {
        return tomato;
    }
}