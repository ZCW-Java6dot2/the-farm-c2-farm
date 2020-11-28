package Farm;

import Person.Farmer;
import Person.Pilot;
import Vehicle.CropDuster;
import Vehicle.Tractor;
import java.util.ArrayList;
import java.util.List;

public class Farm {
    private List<Stable> stableList;
    private final List<ChickenCoop> chickenCoop1;
    private final List<ChickenCoop> chickenCoop2;
    private final List<ChickenCoop> chickenCoop3;
    private final List<ChickenCoop> chickenCoop4;
    private final FarmHouse farmHouse;
    private final Field field;
    private final Tractor tractor;
    private final Pilot froilanda;
    private final CropDuster cropDuster;
    private final Farmer froiland;

    public Farm() {
        this.stableList = new ArrayList<>(3);
        this.chickenCoop1 = new ArrayList<>(3);
        this.chickenCoop2 = new ArrayList<>(4);
        this.chickenCoop3 = new ArrayList<>(4);
        this.chickenCoop4 = new ArrayList<>(4);
        this.froiland = new Farmer("Froiland");
        this.tractor = new Tractor(froiland);
        this.field = new Field();
        this.froilanda = new Pilot("Froilanda");
        this.cropDuster = new CropDuster(froilanda);
        this.farmHouse = new FarmHouse(froiland, froilanda);
    }

    public List<Stable> getStableList() {
        return stableList;
    }

    public void setStableList(List<Stable> stableList) {
        this.stableList = stableList;
    }

    public List<ChickenCoop> getChickenCoop1() {
        return chickenCoop1;
    }

    public List<ChickenCoop> getChickenCoop2() {
        return chickenCoop2;
    }

    public List<ChickenCoop> getChickenCoop3() {
        return chickenCoop3;
    }

    public List<ChickenCoop> getChickenCoop4() {
        return chickenCoop4;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getField() {
        return field;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public Pilot getFroilanda() {
        return froilanda;
    }

    public CropDuster getCropDuster() {
        return cropDuster;
    }

    public Farmer getFroiland() {
        return froiland;
    }
}
