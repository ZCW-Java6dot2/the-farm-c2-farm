package Farm;


import java.util.ArrayList;

public class CropRow<T extends Crop> {

    private ArrayList<T> cropRow;
    private boolean hasBeenFertilized;

    public <T extends Crop> CropRow(){
        this.cropRow = new ArrayList<>();
    }

    public ArrayList<T> getCropRow() {
        return cropRow;
    }

    public void setCropRow(ArrayList<T> cropRow) {
        this.cropRow = cropRow;
    }
}

