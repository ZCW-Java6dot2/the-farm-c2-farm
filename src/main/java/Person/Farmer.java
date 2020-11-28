package Person;

import Farm.Crop;
import Farm.CropRow;
import Interfaces.Botanist;
import Interfaces.Produce;
import Interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist {

    @Override
    public <T extends Crop> void plant(T cropType) {
       CropRow<T> cropRow = new CropRow<T>();

    }

    @Override
    public void eat(Produce p) {

    }
}
