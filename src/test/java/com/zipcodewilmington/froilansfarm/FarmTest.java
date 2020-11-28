package com.zipcodewilmington.froilansfarm;

import Animal.Chicken;
import Animal.Horse;
import Farm.Farm;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;
import Farm.*;
import org.junit.Test;

public class FarmTest {

    Farm farm= new Farm();
    Horse horse1 = new Horse();
    Horse horse2 = new Horse();
    Horse horse3= new Horse();
    Horse horse4 = new Horse();
    List<Horse> horseList1 = new ArrayList<>();
    List<Horse> horseList2 = new ArrayList<>();
    ArrayList<Stable> stables = new ArrayList<Stable>();
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();

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
        //Data preparation for Horse
        //2 Stable , each with 2 Horses
        horseList1.add(horse1);
        horseList1.add(horse2);
        horseList2.add(horse3);
        horseList2.add(horse4);
        stable1.setHorseList(horseList1);
        stable2.setHorseList(horseList2);
        stables.add(stable1);
        stables.add(stable2);

        //Data preparation for chicken
        //2 Chicken Coops , each with 2 chickens

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
    public void setStableListFarm() {
        //Given

        //When
        farm.setStableList(stables);

        //Then
        Assert.assertEquals(stables, farm.getStableList());
    }

    @Test
    public void getStableListFarm() {
        //Given
        Integer expected =2;
        //When
        farm.setStableList(stables);

        //Then
        Assert.assertEquals(2, farm.getStableList().size());
    }

    @Test
    public void setChickenCoopListFarm() {
        //Given

        //When
        farm.setChickenCoopList(chickenCoops);

        //Then
        Assert.assertEquals(chickenCoops, farm.getChickenCoopList());
    }

    @Test
    public void getChickenCoopListFarm() {
        //Given
        Integer expected =2;
        //When
        farm.setChickenCoopList(chickenCoops);

        //Then
        Assert.assertEquals(2, farm.getChickenCoopList().size());
    }


}
