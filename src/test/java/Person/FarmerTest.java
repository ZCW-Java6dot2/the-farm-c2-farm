package Person;

import Farm.Farm;
import Items.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;
import Farm.Crop;
import Farm.Field;
import static org.junit.Assert.*;

public class FarmerTest {

    Farm farm = new Farm();
    Farmer farmer = farm.getFroiland();
    Crop tomatoPlant = new TomatoPlant("tomato");
    Field field = farm.getField();

    @Test
    public void plant() {
        //Given
        int expected = 5;

        //When
        farmer.plant(farm.getField(), tomatoPlant, "tomato", 5);
        int actual = field.getCropRowList().get(0).getCropRow().size();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest() {

    }

    @Test
    public void makeNoiseTest() {

        Assert.assertEquals("Alpha Room, Now!", farmer.makeNoise());
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Froiland",farm.getFroiland().getName());
    }

}