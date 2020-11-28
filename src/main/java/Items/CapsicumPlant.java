package Items;

import Farm.Crop;
import Interfaces.Produce;

public class CapsicumPlant extends Crop implements Produce {

    public CapsicumPlant() {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    public CapsicumPlant(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
            this.hasBeenFertilized = hasBeenFertilized;
            this.hasBeenHarvested = hasBeenHarvested;

    }

}
