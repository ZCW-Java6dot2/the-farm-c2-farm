package Farm;

import Person.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmHouseTest {

    Farm farm = new Farm();
    Farmer farmer = new Farmer("Billy Ray");
    FarmHouse house = farm.getFarmHouse();

    @Test
    public void addNewFarmer() {
        //When
        int expected = 3;
        house.addNewFarmer("Llewellen");

        Assert.assertEquals(expected, house.getPersonList().size());
    }

    @Test
    public void removeFarmer() {
        int expected = 1;
        house.removeFarmer("Froiland");

        Assert.assertEquals(expected, house.getPersonList().size());
    }

    @Test
    public void getPersonList() {
        int expected = 2;

        Assert.assertEquals(expected, house.getPersonList().size());

    }

}