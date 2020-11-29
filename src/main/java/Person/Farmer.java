package Person;

import Farm.Crop;
import Interfaces.Botanist;
import Interfaces.Produce;

import Farm.Field;

public class Farmer extends Person implements Botanist {

    public Farmer(String name) {
        super(name);
    }

    @Override
    public <T extends Crop> void plant(Field field, T plantType, String plantName, int numOfPlants) {
       Crop<T> cropRow = new Crop<T>(plantName);
        for (int i = 0; i < numOfPlants; i++) {
            cropRow.getCropRow().add(plantType);
        }
        field.getCropRowList().add(cropRow);
    }


}
