package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testcreateDog(){
        //given
        String name = "Spot";
        Date birthDate = new Date();
        Integer numberOfDogs = 0;
        //when
        Dog spot = AnimalFactory.createDog(name,birthDate);
        //then
        Assert.assertEquals(name,spot.getName());
        Assert.assertEquals(birthDate,spot.getBirthDate());
        Assert.assertEquals(numberOfDogs,spot.getId());
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testcreateCat(){
        //given
        String name = "mittens";
        Date birthDate = new Date();
        Integer numberOfCats = 0;
        //when
        Cat mittens = AnimalFactory.createCat(name,birthDate);
        //then
        Assert.assertEquals(name,mittens.getName());
        Assert.assertEquals(birthDate,mittens.getBirthDate());
        Assert.assertEquals(numberOfCats,mittens.getId());
    }
}
