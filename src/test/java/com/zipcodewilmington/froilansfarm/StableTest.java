package com.zipcodewilmington.froilansfarm;
import Animal.Horse;
import Farm.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class StableTest {

    Horse horse1 = new Horse();
    Horse horse2 = new Horse();
    Horse horse3= new Horse();
    Horse horse4 = new Horse();
    List<Horse> horseList1 = new ArrayList<>();
    List<Horse> horseList2 = new ArrayList<>();
    ArrayList<Stable> stables = new ArrayList<Stable>();
    Stable stable1 = new Stable();
    Stable stable2 = new Stable();


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
    public void setHorseListInStable() {
        //Given

        //When
         stable1.setHorseList(horseList1);

        //Then
        Assert.assertEquals(horseList1, stable1.getHorseList());
    }

    @Test
    public void getHorseListInStable() {
        //Given

        //When
        stable1.setHorseList(horseList1);

        //Then
        Assert.assertEquals(horseList1, stable1.getHorseList());
    }

    @Test
    public void getCountofHorsesStable() {
        //Given
        Integer expected =2;
        //When
         Integer actual= stable1.getNumOfHorses();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addHorsesTest() {
        //Given
        Integer expected =4;
        //When
        stable1.setHorseList(horseList1);
        stable1.addHorses(2);
        Integer actual= stable1.getNumOfHorses();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeHorsesTest() {
        //Given
        Integer expected =3;
        //When
        stable1.setHorseList(horseList1);
        stable1.addHorses(4);
        stable1.removeHorses(3);
        Integer actual= stable1.getNumOfHorses();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
