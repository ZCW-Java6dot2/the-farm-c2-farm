package Farm;

import Items.Capsicum;
import Items.CapsicumPlant;
import Items.TomatoPlant;
import Person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {
    Farm farm = new Farm();
    Field field = farm.getField();
    Farmer farmer = new Farmer("Billy Ray");
    TomatoPlant tomatoPlant = new TomatoPlant("tomato");
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
        int actual = field.getCropRowList().get(0).getCropRow().size();

        //Then
        Assert.assertEquals(expected, actual);
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