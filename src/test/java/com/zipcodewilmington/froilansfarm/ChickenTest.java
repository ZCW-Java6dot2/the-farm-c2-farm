package com.zipcodewilmington.froilansfarm;

import Animal.Chicken;
import Farm.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ChickenTest {

    Farm farmTest = new Farm();
    Chicken chicken = farmTest.getChickenCoop1().getChickenList().get(0);



    @Test
    public void makeNoiseTest() {
        //Given
        //Person created in @Before
        String expected = "buk buk";
        //When
        String actual = chicken.makeNoise();
        //Then
        Assert.assertEquals(expected,  actual);
    }
}
