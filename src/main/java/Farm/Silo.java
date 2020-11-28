package Farm;

import Items.Capsicum;
import Items.Carrot;
import Items.EarCorn;
import Items.EarOfWheat;
import Items.Egg;
import Items.Tomato;

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

    public void setCapsicum(List<Capsicum> capsicum) {
        this.capsicum = capsicum;
    }

    public List<Carrot> getCarrot() {
        return carrot;
    }

    public void setCarrot(List<Carrot> carrot) {
        this.carrot = carrot;
    }

    public List<EarCorn> getCorn() {
        return corn;
    }

    public void setCorn(List<EarCorn> corn) {
        this.corn = corn;
    }

    public List<EarOfWheat> getWheat() {
        return wheat;
    }

    public void setWheat(List<EarOfWheat> wheat) {
        this.wheat = wheat;
    }

    public List<Egg> getEgg() {
        return egg;
    }

    public void setEgg(List<Egg> egg) {
        this.egg = egg;
    }

    public List<Tomato> getTomato() {
        return tomato;
    }

    public void setTomato(List<Tomato> tomato) {
        this.tomato = tomato;
    }
}
