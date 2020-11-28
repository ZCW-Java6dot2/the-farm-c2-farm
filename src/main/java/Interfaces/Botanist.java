package Interfaces;

import Farm.Crop;

public interface Botanist {

    <T extends Crop> void plant(T cropType, int numOfCrops);
}
