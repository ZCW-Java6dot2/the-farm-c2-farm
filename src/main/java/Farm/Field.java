package Farm;

import Interfaces.Produce;
import Items.*;

import java.util.ArrayList;
import java.util.List;

public class Field implements Produce {
    public boolean hasBeenFertilized = false;
    public boolean hasBeenHarvested = false;
    List<Crop> cropRowList;

    public Field() {
        cropRowList = new ArrayList<>(0);
    }


    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public boolean isHasBeenHarvested() {
        return hasBeenHarvested;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public List<Crop> getCropRowList() {
        return cropRowList;
    }

    public void setCropRowList(List<Crop> cropRowList) {
        this.cropRowList = cropRowList;
    }

    @Override
    public void yield(Silo silo) {
        Integer yieldOfPlantCrop = 0;
        String nameOfCrop = "";
        harvesting(silo);
        reinitializeField();
    }

    public void reinitializeField() {
        cropRowList.clear();
        hasBeenFertilized = false;
        hasBeenHarvested = false;
    }

    public void harvesting(Silo silo) {
        String nameOfCrop;
        Integer yieldOfPlantCrop;
        for (Crop crop : cropRowList) {
            yieldOfPlantCrop = crop.getCropRow().size() * 3;
            for (int i = 0; i < yieldOfPlantCrop; i++) {
                nameOfCrop = crop.getName();
                if (nameOfCrop.equals("capsicum")) {
                    silo.capsicum.add(new Capsicum());
                }
                if(nameOfCrop.equals("carrot")) {
                    silo.carrot.add(new Carrot());
                }
                if(nameOfCrop.equals("Corn")) {
                    silo.corn.add(new EarCorn());
                }
                if(nameOfCrop.equals("Wheat")) {
                    silo.wheat.add(new EarOfWheat());
                }
                if(nameOfCrop.equals("Tomato")) {
                    silo.tomato.add(new Tomato());
                }
            }
        }
    }
}
