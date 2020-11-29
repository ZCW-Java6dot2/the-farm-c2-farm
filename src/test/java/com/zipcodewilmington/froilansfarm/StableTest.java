package com.zipcodewilmington.froilansfarm;

import Farm.Farm;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {
    Farm farmTest = new Farm();
    @Test
    public void getHorseListInStable1() {
        //Given
        int expected = 3;
        //When
        int actual = farmTest.getStable1().getHorseList().size();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getHorseListInStable2() {
        //Given
        int expected = 3;
        //When
        int actual = farmTest.getStable2().getHorseList().size();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getHorseListInStable3() {
        //Given
        int expected = 4;
        //When
        int actual = farmTest.getStable3().getHorseList().size();
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getCountofHorsesStable() {
        //Given
        Integer expected =3;
        //When
        Integer actual= farmTest.getStable1().getNumOfHorses();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addHorsesTest() {
        //Given
        Integer expected =4;
        //When
        farmTest.getStable1().addHorses(1);
        Integer actual= farmTest.getStable1().getNumOfHorses();
        //Then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeHorsesTest() {
        //Given
        Integer expected =2;
        //When
        farmTest.getStable1().removeHorses(1);
        Integer actual= farmTest.getStable1().getNumOfHorses();
        //Then
        Assert.assertEquals(expected, actual);
    }
}

