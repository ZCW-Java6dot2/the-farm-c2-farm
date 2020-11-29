package Farm;

import Person.Person;
import Vehicle.Vehicle;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmTest {


    @Test
    public void getChickenCoop1() {
        //Given
        Farm farmTest = new Farm();

        //When
        int expected = 3;
        int actual = farmTest.getChickenCoop1().getChickenList().size();

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getChickenCoop2() {
        //Given
        Farm farmTest = new Farm();
        //When
        int expected = 4;
        int actual = farmTest.getChickenCoop2().getChickenList().size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChickenCoop3() {
        //Given
        Farm farmTest = new Farm();
        //When
        int expected = 4;
        int actual = farmTest.getChickenCoop3().getChickenList().size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getChickenCoop4() {
        //Given
        Farm farmTest = new Farm();
        //When
        int expected = 4;
        int actual = farmTest.getChickenCoop4().getChickenList().size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFarmHouse() {
        //Given
        Farm farmTest = new Farm();

        //When
        int expected = 2;

        //Then
        Assert.assertEquals(expected, farmTest.getFarmHouse().getPersonList().size());

    }


    @Test
    public void getTractor() {
        //Given
        Farm farmTest = new Farm();

        //Then
        Assert.assertTrue(farmTest.getTractor() instanceof Vehicle);

    }

    @Test
    public void getFroilanda() {
        //Given
        Farm farmTest = new Farm();

        //Then
        Assert.assertTrue(farmTest.getFroilanda() instanceof Person);
    }

    @Test
    public void getCropDuster() {
        //Given
        Farm farmTest = new Farm();

        //Then
        Assert.assertTrue(farmTest.getCropDuster() instanceof Vehicle);
    }

    @Test
    public void getFroiland() {
        //Given
        Farm farmTest = new Farm();

        //Then
        Assert.assertTrue(farmTest.getFroiland() instanceof Person);
    }

    @Test
    public void getSilo() {
        //Given
        Farm farmTest = new Farm();

        Silo expected = farmTest.getSilo();

        //Then
        Assert.assertEquals(expected, farmTest.getSilo());
    }
}