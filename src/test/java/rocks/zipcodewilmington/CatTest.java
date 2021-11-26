package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        //Given
        String oldName = "george";
        String newName = "Mittens";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Cat mittens = new Cat(oldName,givenBirthDate,id);
        mittens.setName(newName);
        String actualName = mittens.getName();
        String expectedName = newName;
        //then
        Assert.assertEquals(expectedName,actualName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //given
        String oldName = "george";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Cat mittens = new Cat(oldName,givenBirthDate,id);
        String expectedSpeak = "meow!";
        String actualSpeak = mittens.speak();
        //then
        Assert.assertEquals(expectedSpeak,actualSpeak);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        //given
        String oldName = "george";
        Date givenBirthDate = new Date();
        Integer id = 1;
        Date newBirthDate = new Date();
        //when
        Cat mittens = new Cat(oldName,givenBirthDate,id);
        mittens.setBirthDate(newBirthDate);
        Date expected = newBirthDate;
        Date actual = mittens.getBirthDate();
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        //given
        String oldName = "george";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Cat mittens = new Cat(oldName,givenBirthDate,id);
        Food catFood = new Food();
        mittens.eat(catFood);
        Integer actualMeals = mittens.getNumberOfMealsEaten();
        Integer expectedMeals = 1;
        //then
        Assert.assertEquals(expectedMeals,actualMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIDTest() {
        //given
        String oldName = "george";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Cat mittens = new Cat(oldName,givenBirthDate,id);
        Integer expectedID = id;
        Integer actualID = mittens.getId();
        //then
        Assert.assertEquals(expectedID,actualID);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void isAnAnimalTest() {
        //given
        String oldName = "george";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Cat mittens = new Cat(oldName,givenBirthDate,id);
        //then
        Assert.assertTrue(mittens instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void isAnMammalTest(){
        //given
        String oldName = "george";
        Date givenBirthDate = new Date();
        Integer id = 1;
        //when
        Cat mittens = new Cat(oldName,givenBirthDate,id);
        //then
        Assert.assertTrue(mittens instanceof Mammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
