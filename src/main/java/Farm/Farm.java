package Farm;

import Person.Farmer;
import Person.Pilot;
import Vehicle.CropDuster;
import Vehicle.Tractor;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    private final Stable stable1;
    private final Stable stable2;
    private final Stable stable3;
    private final ChickenCoop chickenCoop1;
    private final ChickenCoop chickenCoop2;
    private final ChickenCoop chickenCoop3;
    private final ChickenCoop chickenCoop4;
    private final FarmHouse farmHouse;
    private final Silo silo;
    private final Field field;
    private final Tractor tractor;
    private final Pilot froilanda;
    private final CropDuster cropDuster;
    private final Farmer froiland;
    private List<ChickenCoop> chickenCoopList;

    public Farm() {
        this.stable1 = new Stable(3);
        this.stable2 = new Stable(3);
        this.stable3 = new Stable(4);
        this.chickenCoop1 = new ChickenCoop(3);
        this.chickenCoop2 = new ChickenCoop(4);
        this.chickenCoop3 = new ChickenCoop(4);
        this.chickenCoop4 = new ChickenCoop(4);

        this.silo = new Silo();
        this.froiland = new Farmer("Froiland");
        this.tractor = new Tractor(froiland, true);
        this.field = new Field();
        this.froilanda = new Pilot("Froilanda");
        this.cropDuster = new CropDuster(froilanda, true);
        this.farmHouse = new FarmHouse(froiland, froilanda);
    }

    public Silo getSilo() {
        return silo;
    }

    public ChickenCoop getChickenCoop1() {
        return chickenCoop1;
    }

    public ChickenCoop getChickenCoop2() {
        return chickenCoop2;
    }

    public ChickenCoop getChickenCoop3() {
        return chickenCoop3;
    }

    public ChickenCoop getChickenCoop4() {
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

    public Stable getStable1() {
        return stable1;
    }

    public Stable getStable2() {
        return stable2;
    }

    public Stable getStable3() {
        return stable3;
    }

    public List<ChickenCoop> getChickenCoopList() {
        return chickenCoopList;
    }
}
