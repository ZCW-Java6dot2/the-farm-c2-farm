package Items;

import Farm.Crop;
import Interfaces.Produce;

public class CornStalk extends Crop implements Produce {

    public CornStalk() {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    public CornStalk(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;

    }
}
