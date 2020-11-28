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
  //  Farm farm= new Farm();
    Horse horse1 = new Horse();
    Horse horse2 = new Horse();
    Horse horse3= new Horse();
    Horse horse4 = new Horse();
    List<Horse> horseList1 = new ArrayList<>();
    List<Horse> horseList2 = new ArrayList<>();
    ArrayList<Stable> stables = new ArrayList<Stable>();
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();
    Person rider = new Person();

    @Before
    public void startup()
    {

        //Given
        horseList1.add(horse1);
        horseList1.add(horse2);
        horseList2.add(horse3);
        horseList2.add(horse4);
        stable1.setHorseList(horseList1);
        stable2.setHorseList(horseList2);
        stables.add(stable1);
        stables.add(stable2);

    }

    @Test
    public void mountTest() {
       //Given
        Boolean expected = true;
        //When
        Boolean actual = stables.get(0).getHorseList().get(0).mount(rider);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void disMountTest() {
        //Given
        Boolean expected = false;
        //When
        Boolean actual = stables.get(0).getHorseList().get(0).dismount();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setAndGetRiderTest() {
        //Given
        //Person created in @Before
        //When
        horse1.setRider(rider);
        //Then
        Assert.assertEquals(rider,  horse1.getRider());
    }

    @Test
    public void makeNoiseTest() {
        //Given
        //Person created in @Before
        String expected = "Neigh Neigh";
        //When
        String actual = horse1.makeNoise();
        //Then
        Assert.assertEquals(expected,  actual);
    }
    @Test
    public void setFlagTest() {
        Boolean expected = false;
        //When
        stables.get(0).getHorseList().get(0).setMountDisMount(false);
        Boolean actual = stables.get(0).getHorseList().get(0).getMountDisMount();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
