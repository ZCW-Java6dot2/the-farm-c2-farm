package Farm;

import Items.*;
import Person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {
    Farm farm = new Farm();
    Field field = farm.getField();
    Farmer farmer = new Farmer("Billy Ray");
    TomatoPlant tomatoPlant = new TomatoPlant("tomato");
    WheatStalk wheatStalk = new WheatStalk("wheat");
    CarrotPlant carrotPlant = new CarrotPlant("carrot");
    CornStalk cornStalk = new CornStalk("corn");
    CapsicumPlant capsicumPlant = new CapsicumPlant("capsicum");
    Silo silo = new Silo();

    @Test
    public void isHasBeenFertilized() {
        Assert.assertFalse(field.isHasBeenFertilized());
    }

    @Test
    public void setHasBeenFertilized() {
        field.setHasBeenFertilized(true);
        Assert.assertTrue(field.isHasBeenFertilized());
    }

    @Test
    public void isHasBeenHarvested() {
        Assert.assertFalse(field.isHasBeenHarvested());
    }

    @Test
    public void setHasBeenHarvested() {
        field.setHasBeenHarvested(true);
        Assert.assertTrue(field.isHasBeenHarvested());
    }

    @Test
    public void getCropRowList() {
        int expected = 5;

        //When
        farmer.plant(farm.getField(), tomatoPlant, "tomato", 5);
        farmer.plant(farm.getField(), wheatStalk, "wheat", 5);
        farmer.plant(farm.getField(), carrotPlant, "carrot", 5);
        farmer.plant(farm.getField(), cornStalk, "corn", 5);
        farmer.plant(farm.getField(), capsicumPlant, "capsicum", 5);

        int actualTomato = field.getCropRowList().get(0).getCropRow().size();
        int actualWheat = field.getCropRowList().get(1).getCropRow().size();
        int actualCarrot = field.getCropRowList().get(2).getCropRow().size();
        int actualCorn = field.getCropRowList().get(3).getCropRow().size();
        int actualCapsicum = field.getCropRowList().get(4).getCropRow().size();

        //Then
        Assert.assertEquals(expected, actualTomato);
        Assert.assertEquals(expected, actualWheat);
        Assert.assertEquals(expected, actualCarrot);
        Assert.assertEquals(expected, actualCorn);
        Assert.assertEquals(expected, actualCapsicum);
    }


    @Test
    public void yield() {

        Assert.assertTrue(field.yield(farm.getSilo()));
    }

    @Test
    public void reinitializeField() {
        //Given

        //When
        farmer.plant(farm.getField(), tomatoPlant, "tomato", 5);
        field.reinitializeField();

        //Then
        Assert.assertEquals(0, field.getCropRowList().size());
        Assert.assertFalse(field.isHasBeenHarvested());
        Assert.assertFalse(field.isHasBeenFertilized());
    }

    @Test
    public void harvesting() {
        //Given
        CapsicumPlant capsicumPlant = new CapsicumPlant("capsicum");

        //When
        farmer.plant(farm.getField(), capsicumPlant, "capsicum", 5);
        field.yield(silo);

        //Then
        Assert.assertEquals(15, silo.getCapsicum().size());
    }
}