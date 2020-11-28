package Farm;

import Interfaces.Produce;

public abstract class Crop implements Produce {

    protected static boolean hasBeenFertilized;
    protected static boolean hasBeenHarvested;

    public Crop() {
        this.hasBeenFertilized = false;
        this.hasBeenHarvested = false;
    }
    public Crop(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public void yield() {

    }
}
