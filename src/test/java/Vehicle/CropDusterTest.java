package Vehicle;

import Farm.Farm;
import Person.Person;
import Person.Pilot;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import Farm.*;
public class CropDusterTest {

    Farm farm = new Farm();
    Field field = farm.getField();
    Silo silo = farm.getSilo();
    CropDuster plane = farm.getCropDuster();
    Pilot pilot = farm.getFroilanda();

    @Test
    public void isMountDisMount() {
        //When
        //plane.mount(pilot);
        Assert.assertTrue(plane.isMountDisMount());

    }

    @Test
    public void setMountDisMount() {
        //When
        plane.setMountDisMount(false);

        Assert.assertFalse(plane.isMountDisMount());
    }

    @Test
    public void makeNoise() {
        String expected = "Buzzzz whirrrrr";

        Assert.assertEquals(expected, plane.makeNoise());
    }

    @Test
    public void operate() {

        //Then
        Assert.assertTrue(plane.operate(field, silo));
    }

    @Test
    public void flying() {

        Assert.assertTrue(plane.flying());
    }

    @Test
    public void mount() {

        Assert.assertTrue(plane.mount(pilot));
    }

    @Test
    public void dismount() {
        Assert.assertFalse(plane.dismount());
    }
}