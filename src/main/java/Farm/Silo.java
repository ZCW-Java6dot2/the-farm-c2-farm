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
    List<Capsicum> capsicumInventory;
    List<Carrot> carrotInventory;
    List<EarCorn> cornInventory;
    List<EarOfWheat> wheatInventory;
    List<Egg> eggInventory;
    List<Tomato> tomatoInventory;

    public Silo() {
        capsicumInventory = new ArrayList<>(0);
        carrotInventory = new ArrayList<>(0);
        cornInventory = new ArrayList<>(0);
        wheatInventory = new ArrayList<>(0);
        eggInventory = new ArrayList<>(0);
        tomatoInventory = new ArrayList<>(0);
    }

    public List<Capsicum> getCapsicumInventory() {
        return capsicumInventory;
    }

    public void setCapsicumInventory(List<Capsicum> capsicumInventory) {
        this.capsicumInventory = capsicumInventory;
    }

    public List<Carrot> getCarrotInventory() {
        return carrotInventory;
    }

    public void setCarrotInventory(List<Carrot> carrotInventory) {
        this.carrotInventory = carrotInventory;
    }

    public List<EarCorn> getCornInventory() {
        return cornInventory;
    }

    public void setCornInventory(List<EarCorn> cornInventory) {
        this.cornInventory = cornInventory;
    }

    public List<EarOfWheat> getWheatInventory() {
        return wheatInventory;
    }

    public void setWheatInventory(List<EarOfWheat> wheatInventory) {
        this.wheatInventory = wheatInventory;
    }

    public List<Egg> getEggInventory() {
        return eggInventory;
    }

    public void setEggInventory(List<Egg> eggInventory) {
        this.eggInventory = eggInventory;
    }

    public List<Tomato> getTomatoStock() {
        return tomatoInventory;
    }

    public void setTomatoStock(List<Tomato> tomatoStock) {
        this.tomatoInventory = tomatoStock;
    }
}
