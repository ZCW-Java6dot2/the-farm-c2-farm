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
    Chicken chicken = farmTest.getChickenCoop1().getChickenList().get(0);
//
//
//    @Before
//    public void startup()
//    {
//        //Given
//        chickenList1.add(chicken1);
//        chickenList1.add(chicken2);
//        chickenList2.add(chicken3);
//        chickenList2.add(chicken4);
//        chickenCoop1.setChickenList(chickenList1);
//        chickenCoop2.setChickenList(chickenList2);
//        chickenCoops.add(chickenCoop1);
//        chickenCoops.add(chickenCoop2);
//    }
//
//    @Test
//    public void setChickenListInCoops() {
//        //Given
//
//        //When
//        chickenCoop1.setChickenList(chickenList1);
//
//        //Then
//        Assert.assertEquals(chickenList1, chickenCoop1.getChickenList());
//    }
//
//    @Test
//    public void getChickenListInCoops() {
//        //Given
//
//        //When
//        chickenCoop1.setChickenList(chickenList1);
//
//        //Then
//        Assert.assertEquals(chickenList1, chickenCoop1.getChickenList());
//    }
//
//    @Test
//    public void getCountofChickensCoops() {
//        //Given
//        Integer expected =2;
//        //When
//        Integer actual= chickenCoop1.getNumOfChickens();
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void addChickensTest() {
//        //Given
//        Integer expected =4;
//        //When
//        chickenCoop1.setChickenList(chickenList1);
//        chickenCoop1.addChickens(2);
//        Integer actual= chickenCoop1.getNumOfChickens();
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void removeChickensTest() {
//        //Given
//        Integer expected =3;
//        //When
//        chickenCoop1.setChickenList(chickenList1);
//        chickenCoop1.addChickens(4);
//        chickenCoop1.removeChickens(3);
//        Integer actual= chickenCoop1.getNumOfChickens();
//        //Then
//        Assert.assertEquals(expected, actual);
//    }
//
}


