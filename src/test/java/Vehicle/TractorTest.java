package Vehicle;

import Farm.Farm;
import Person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import Farm.*;
public class TractorTest {

    Farm farm = new Farm();
    Field field = farm.getField();
    Silo silo = farm.getSilo();
    Tractor tractor = farm.getTractor();
    Person froiland = farm.getFroiland();

    @Test
    public void isMountDisMount() {
        Assert.assertTrue(tractor.isMountDisMount());
    }

    @Test
    public void setMountDisMount() {
        //When
        tractor.setMountDisMount(false);

        Assert.assertFalse(tractor.isMountDisMount());
    }

    @Test
    public void makeNoise() {
        String expected = "hummmmmmmmmmmmmmmmmmm";

        Assert.assertEquals(expected, tractor.makeNoise());
    }

    @Test
    public void operate() {
        Assert.assertTrue(tractor.operate(field, silo));
    }

    @Test
    public void testMakeNoise() {
        String expected = "hummmmmmmmmmmmmmmmmmm";

        Assert.assertEquals(expected, tractor.makeNoise());
    }

    @Test
    public void mount() {
        Assert.assertTrue(tractor.mount(froiland));
    }

    @Test
    public void dismount() {
        Assert.assertFalse(tractor.dismount());
    }
}