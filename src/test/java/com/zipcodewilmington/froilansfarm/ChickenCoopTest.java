package com.zipcodewilmington.froilansfarm;

import Animal.Chicken;
import Farm.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class ChickenCoopTest {
    Farm farmTest = new Farm();

    @Test
    public void getChickenInCoop1() {
        //Given
        int expected = 3;
        //When
        int actual = farmTest.getChickenCoop1().getNumOfChickens();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChickenInCoop2() {
        //Given
        int expected = 4;
        //When
        int actual = farmTest.getChickenCoop2().getNumOfChickens();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChickenInCoop3() {
        //Given
        int expected = 4;
        //When
        int actual = farmTest.getChickenCoop3().getNumOfChickens();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChickenInCoop4() {
        //Given
        int expected = 4;
        //When
        int actual = farmTest.getChickenCoop4().getNumOfChickens();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addChickenTest() {
        //Given
        Integer expected = 5;
        //When
        farmTest.getChickenCoop1().addChickens(2);
        Integer actual = farmTest.getChickenCoop1().getNumOfChickens();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeChickenTest() {
        //Given
        Integer expected = 1;
        //When
        farmTest.getChickenCoop1().removeChickens(2);
        Integer actual = farmTest.getChickenCoop1().getNumOfChickens();
        //Then
        Assert.assertEquals(expected, actual);
    }
}



