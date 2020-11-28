package Interfaces;

import Farm.Crop;
import Farm.Field;

public interface Botanist {

    <T extends Crop> void plant(Field field, T cropType, int numOfPlants);
}
