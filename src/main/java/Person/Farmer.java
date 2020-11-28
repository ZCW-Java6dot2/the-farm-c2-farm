package Person;

import Farm.Crop;
import Farm.CropRow;
import Interfaces.Botanist;
import Interfaces.Produce;
import Interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist {

    @Override
    public <T extends Crop> void plant(T cropType, int numOfCrops) {
       CropRow<T> cropRow = new CropRow<T>();

        for (int i = 0; i < numOfCrops; i++) {
            cropRow.getCropRow().add(cropType);
        }

    }

    @Override
    public void eat(Produce p) {

    }
}
