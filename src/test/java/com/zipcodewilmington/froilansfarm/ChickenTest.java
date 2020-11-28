package com.zipcodewilmington.froilansfarm;

import Animal.Chicken;
import Farm.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ChickenTest {


    Chicken chicken1 = new Chicken();
    Chicken chicken2 = new Chicken();
    Chicken chicken3 = new Chicken();
    Chicken chicken4 = new Chicken();
    List<Chicken> chickenList1 = new ArrayList<>();
    List<Chicken> chickenList2 = new ArrayList<>();
    ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    ChickenCoop chickenCoop1=new ChickenCoop();
    ChickenCoop chickenCoop2=new ChickenCoop();

    @Before
    public void startup()
    {

        //Given
        chickenList1.add(chicken1);
        chickenList1.add(chicken2);
        chickenList2.add(chicken3);
        chickenList2.add(chicken4);
        chickenCoop1.setChickenList(chickenList1);
        chickenCoop2.setChickenList(chickenList2);
        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
    }

    @Test
    public void makeNoiseTest() {
        //Given
        //Person created in @Before
        String expected = "buk buk";
        //When
        String actual = chicken1.makeNoise();
        //Then
        Assert.assertEquals(expected,  actual);
    }
}
