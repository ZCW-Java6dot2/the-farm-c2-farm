package Items;

import Farm.Crop;
import Interfaces.Produce;

public class TomatoPlant extends Crop implements Produce {
    public TomatoPlant() {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    public TomatoPlant(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;

    }
}
