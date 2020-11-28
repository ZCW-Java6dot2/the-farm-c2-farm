package Farm;

import java.util.ArrayList;
import java.util.List;

public class CropRow<T extends Crop> {

    private ArrayList<T> cropRow;

    public <T> CropRow(){
        this.cropRow = new ArrayList<>();
    }
}
