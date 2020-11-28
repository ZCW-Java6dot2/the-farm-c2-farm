package Items;

import Farm.Crop;
import Interfaces.Produce;

public class CarrotPlant extends Crop implements Produce {
    public CarrotPlant() {
        super(hasBeenFertilized, hasBeenHarvested);
    }

    public CarrotPlant(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        super(hasBeenFertilized, hasBeenHarvested);
        this.hasBeenFertilized = hasBeenFertilized;
        this.hasBeenHarvested = hasBeenHarvested;

    }
}
