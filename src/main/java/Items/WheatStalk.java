package Items;

import Farm.Crop;
import Interfaces.Produce;

public class WheatStalk extends Crop implements Produce {
    public WheatStalk() {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    public WheatStalk(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;

    }
}
