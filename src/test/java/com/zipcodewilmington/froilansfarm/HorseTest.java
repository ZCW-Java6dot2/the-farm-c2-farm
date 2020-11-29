package com.zipcodewilmington.froilansfarm;

import Animal.Horse;
import Farm.*;
import Person.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class HorseTest {

    Farm farmTest = new Farm();
    Horse horseTest = farmTest.getStable1().getHorseList().get(0);

    @Test
    public void mountTest() {
       //Given
        Boolean expected = true;
        //When
        Boolean actual = farmTest.getStable1().getHorseList().get(0).mount(farmTest.getFroiland());
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void disMountTest() {
        //Given
        Boolean expected = false;
        //When
        Boolean actual = farmTest.getStable1().getHorseList().get(0).dismount();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setAndGetRiderTest() {
        //When
        farmTest.getStable1().getHorseList().get(0).setRider(farmTest.getFroiland());
        //Then
        Assert.assertEquals(farmTest.getFroiland(),  farmTest.getStable1().getHorseList().get(0).getRider());
    }

    @Test
    public void makeNoiseTest() {

        String expected = "Neigh Neigh";
        //When
        String actual = horseTest.makeNoise();
        //Then
        Assert.assertEquals(expected,  actual);
    }
    @Test
    public void setFlagTest() {
        Boolean expected = false;
        //When
        horseTest.setMountDisMount(false);
        Boolean actual = horseTest.getMountDisMount();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
