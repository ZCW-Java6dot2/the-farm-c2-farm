package Farm;

import java.util.ArrayList;
import java.util.List;

public class Field {
    public boolean hasBeenFertilized = false;
    public boolean hasBeenHarvested = false;
    List<CropRow> cropRowList;

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

    public List<CropRow> getCropRowList() {
        return cropRowList;
    }

    public void setCropRowList(List<CropRow> cropRowList) {
        this.cropRowList = cropRowList;
    }

}
