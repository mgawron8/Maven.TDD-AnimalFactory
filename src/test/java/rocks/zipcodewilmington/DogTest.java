package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Animal;
import java.util.Date;
/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest(){
        //given
        String givenName = "Spot";
        Date givenDate = new Date();
        Integer givenId = 1;
        //when
        Dog spot = new Dog(givenName,givenDate,givenId);
        String actualName = spot.getName();
        Date actualDate = spot.getBirthDate();
        Integer actualId = spot.getId();
        //then
        Assert.assertEquals(givenName,actualName);
        Assert.assertEquals(givenDate,actualDate);
        Assert.assertEquals(givenId,actualId);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //given
        String oldName = "Spot";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Dog spot = new Dog(oldName,givenBirthDate,id);
        String expectedSpeak = "bark!";
        String actualSpeak = spot.speak();
        //then
        Assert.assertEquals(expectedSpeak,actualSpeak);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        //given
        String oldName = "spot";
        Date givenBirthDate = new Date();
        Integer id = 1;
        Date newBirthDate = new Date();
        //when
        Dog spot = new Dog(oldName,givenBirthDate,id);
        spot.setBirthDate(newBirthDate);
        Date expected = newBirthDate;
        Date actual = spot.getBirthDate();
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        //given
        String oldName = "Spot";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Dog spot = new Dog(oldName,givenBirthDate,id);
        Food dogFood = new Food();
        spot.eat(dogFood);
        Integer actualMeals = spot.getNumberOfMealsEaten();
        Integer expectedMeals = 1;
        //then
        Assert.assertEquals(expectedMeals,actualMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIDTest() {
        //given
        String oldName = "spot";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Dog spot = new Dog(oldName,givenBirthDate,id);
        Integer expectedID = id;
        Integer actualID = spot.getId();
        //then
        Assert.assertEquals(expectedID,actualID);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void isAnAnimalTest() {
        //given
        String oldName = "spot";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Dog spot = new Dog(oldName,givenBirthDate,id);
        //then
        Assert.assertTrue(spot instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void isAnMammalTest(){
        //given
        String oldName = "Spot";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Dog spot = new Dog(oldName,givenBirthDate,id);
        //then
        Assert.assertTrue(spot instanceof Mammal);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
