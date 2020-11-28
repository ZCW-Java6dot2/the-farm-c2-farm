package Person;

import Farm.Crop;
import Farm.CropRow;
import Interfaces.Botanist;
import Interfaces.Produce;
import Farm.Field;

public class Farmer extends Person implements Botanist {

    public Farmer(String name) {
        super(name);
    }

    @Override
    public <T extends Crop> void plant(Field field, T cropType, int numOfPlants) {
       CropRow<T> cropRow = new CropRow<T>();

        for (int i = 0; i < numOfPlants; i++) {
            cropRow.getCropRow().add(cropType);
        }
        field.getCropRowList().add(cropRow);
    }

    @Override
    public void eat(Produce p) {

    }
}
