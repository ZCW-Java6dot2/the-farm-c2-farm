package Interfaces;

import Farm.Crop;
import Farm.Field;
import java.lang.String;

public interface Botanist {

    <T extends Crop> void plant(Field field, T plantType, String plantName, int numOfPlants);
}
