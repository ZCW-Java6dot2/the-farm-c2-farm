package Farm;


import Interfaces.Produce;

import java.util.ArrayList;
import java.util.List;

public class Crop<T extends Crop> implements Produce {
    private String name;
    private List<Crop> cropRow;

    public Crop(String name) {
        this.name = name;
        this.cropRow = new ArrayList<>();
    }

    @Override
    public boolean yield(Silo silo) {
        return true;
    }

    public String getName() {
        return name;
    }

    public List<Crop> getCropRow() {
        return cropRow;
    }

}
