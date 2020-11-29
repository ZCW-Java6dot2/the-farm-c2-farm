import Animal.*;
import Farm.*;
import Person.*;
import Vehicle.*;
import Items.*;
import org.junit.Assert;
import org.junit.Test;


public class WednesdayTest {

    Farm farm = new Farm();
    Farmer froiland = farm.getFroiland();
    Person froilanda = farm.getFroilanda();
    Stable stable1 = farm.getStable1();
    Stable stable2 = farm.getStable2();
    Stable stable3 = farm.getStable3();
    Field field = farm.getField();
    Silo silo = farm.getSilo();
    WheatStalk wheatStalk = new WheatStalk("wheat");
    CarrotPlant carrotPlant = new CarrotPlant("carrot");
    TomatoPlant tomatoPlant = new TomatoPlant("tomato");
    CropDuster plane = farm.getCropDuster();
    Tractor tractor = farm.getTractor();
    FarmHouse farmhouse = farm.getFarmHouse();
    ChickenCoop chickenCoop1 = farm.getChickenCoop1();
    ChickenCoop chickenCoop2 = farm.getChickenCoop2();
    ChickenCoop chickenCoop3 = farm.getChickenCoop3();
    ChickenCoop chickenCoop4 = farm.getChickenCoop4();

    @Test
    public void rideStable1Test() {
        // Given
        String expected = "Horse has been ridden";

        // When
        for (int i = 0; i < stable1.getNumOfHorses() ; i++) {
            String actual = stable1.getHorseList().get(i).rideHorse();
            Boolean actualBoolean = stable1.getHorseList().get(i).getRiddenToday();
            // Then
            Assert.assertEquals(expected, actual);
            Assert.assertTrue(actualBoolean);
        }

    }

    @Test
    public void rideStable2Test() {
        // Given
        String expected = "Horse has been ridden";

        // When
        for (int i = 0; i < stable2.getNumOfHorses() ; i++) {
            String actual = stable2.getHorseList().get(i).rideHorse();
            Boolean actualBoolean = stable2.getHorseList().get(i).getRiddenToday();
            // Then
            Assert.assertEquals(expected, actual);
            Assert.assertTrue(actualBoolean);
        }

    }

    @Test
    public void rideStable3Test() {
        // Given
        String expected = "Horse has been ridden";

        // When
        for (int i = 0; i < stable3.getNumOfHorses() ; i++) {
            String actual = stable3.getHorseList().get(i).rideHorse();
            Boolean actualBoolean = stable3.getHorseList().get(i).getRiddenToday();
            // Then
            Assert.assertEquals(expected, actual);
            Assert.assertTrue(actualBoolean);
        }

    }

    @Test
    public void feedStable1Test() {
        //When
        for (int i = 0; i < 100 ; i++) {
            silo.getCorn().add(new EarCorn());
        }

        for (int i = 0; i < stable1.getNumOfHorses(); i++) {
            stable1.getHorseList().get(i).eat("corn", 3, silo);
        }

        int expected = 91;
        int actual = silo.getCorn().size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void feedStable2Test() {
        //When
        for (int i = 0; i < 100 ; i++) {
            silo.getCorn().add(new EarCorn());
        }

        for (int i = 0; i < stable2.getNumOfHorses(); i++) {
            stable2.getHorseList().get(i).eat("corn", 3, silo);
        }

        int expected = 91;
        int actual = silo.getCorn().size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void feedStable3Test() {
        //When
        for (int i = 0; i < 100 ; i++) {
            silo.getCorn().add(new EarCorn());
        }

        for (int i = 0; i < stable3.getNumOfHorses(); i++) {
            stable3.getHorseList().get(i).eat("corn", 3, silo);
        }

        int expected = 88;
        int actual = silo.getCorn().size();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void froilandBreakfastTest() {
        //When
        for (int i = 0; i < 10 ; i++) {
            silo.getCorn().add(new EarCorn());
            silo.getTomato().add(new Tomato());
            silo.getEgg().add(new Egg());
        }

        froiland.eat("corn", 1, silo);
        froiland.eat("tomato", 2, silo);
        froiland.eat("egg", 5, silo);

        int expectedCorn = 9;
        int expectedTomato = 8;
        int expectedEgg = 5;

        int actualCorn = silo.getCorn().size();
        int actualTomato = silo.getTomato().size();
        int actualEgg = silo.getEgg().size();

        Assert.assertEquals(expectedCorn, actualCorn);
        Assert.assertEquals(expectedTomato, actualTomato);
        Assert.assertEquals(expectedEgg, actualEgg);

    }

    @Test
    public void froilandaBreakfastTest() {
        //When
        for (int i = 0; i < 10 ; i++) {
            silo.getCorn().add(new EarCorn());
            silo.getTomato().add(new Tomato());
            silo.getEgg().add(new Egg());
        }

        froilanda.eat("corn", 2, silo);
        froilanda.eat("tomato", 1, silo);
        froilanda.eat("egg", 2, silo);

        int expectedCorn = 8;
        int expectedTomato = 9;
        int expectedEgg = 8;

        int actualCorn = silo.getCorn().size();
        int actualTomato = silo.getTomato().size();
        int actualEgg = silo.getEgg().size();

        Assert.assertEquals(expectedCorn, actualCorn);
        Assert.assertEquals(expectedTomato, actualTomato);
        Assert.assertEquals(expectedEgg, actualEgg);

    }

    @Test
    public void sundayPlantingTest() {
        int expected = 30;

        //When
        froiland.plant(farm.getField(), wheatStalk, "wheat", 30);
        froiland.plant(farm.getField(), carrotPlant, "carrot", 30);
        froiland.plant(farm.getField(), tomatoPlant, "tomato", 30);
        int actualWheat = field.getCropRowList().get(0).getCropRow().size();
        int actualCarrot = field.getCropRowList().get(1).getCropRow().size();
        int actualTomato = field.getCropRowList().get(2).getCropRow().size();

        Assert.assertEquals(expected, actualWheat);
        Assert.assertEquals(expected, actualCarrot);
        Assert.assertEquals(expected, actualTomato);
    }

    @Test
    public void mondayFertilizerTest() {
        boolean expected = true;

        Assert.assertTrue(plane.operate(field, silo));

        boolean actual = field.isHasBeenFertilized();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tuesdayHarvestTest() {

        Assert.assertTrue(tractor.operate(field, silo));
        Assert.assertTrue(field.yield(farm.getSilo()));

    }

    @Test
    public void horseEatTest() {
        //When
        for (int i = 0; i < 10 ; i++) {
            silo.getCorn().add(new EarCorn());
        }


        stable1.getHorseList().get(0).eat("corn", 2, silo);


        int expectedCorn = 8;

        int actualCorn = silo.getCorn().size();

        Assert.assertEquals(expectedCorn, actualCorn);

    }


}
