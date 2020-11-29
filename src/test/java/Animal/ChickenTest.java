package Animal;

import Farm.*;
import Person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {
    Farm farm = new Farm();
    Person froilanda = farm.getFroilanda();
    Silo silo = new Silo();
    Chicken bukbuk = farm.getChickenCoop1().getChickenList().get(0);

    @Test
    public void makeNoise() {
        String expected = "buk buk";

        Assert.assertEquals(expected, bukbuk.makeNoise());
    }

    @Test
    public void testMakeNoise() {
        String expected = "buk buk";

        Assert.assertEquals(expected, bukbuk.makeNoise());

    }

    @Test
    public void yield() {
        int expected = 15;

        bukbuk.rooster();
        bukbuk.yield(silo);

        Assert.assertEquals(expected, silo.getEgg().size());
    }

    @Test
    public void rooster() {
        bukbuk.rooster();

        Assert.assertTrue(bukbuk.isFertilized());
    }

    @Test
    public void eat() {
        int expected = 12;
        bukbuk.rooster();
        bukbuk.yield(silo);
        froilanda.eat("egg", 3, silo);

        Assert.assertEquals(expected, silo.getEgg().size());    }

}