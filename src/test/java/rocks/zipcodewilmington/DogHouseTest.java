package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest() {
        //given
        Dog spot = new Dog("Spot", new Date(), 1);
        Integer actualDog = 1;
        //when
        DogHouse.add(spot);
        Integer numberOfDog = DogHouse.getNumberOfDogs();
        //then
        Assert.assertEquals(numberOfDog, actualDog);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeWithID() {
        //given
        Integer idToBeRemoved = 1;
        Dog spot = new Dog("spot", new Date(), idToBeRemoved);
        //when
        DogHouse.add(spot);
        DogHouse.remove(idToBeRemoved);
        //then
        Assert.assertNull(DogHouse.getDogById(1));
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeWithObject() {
        //given
        Integer idToBeRemoved = 1;
        Dog spot = new Dog("spot", new Date(), 1);
        //when
        DogHouse.add(spot);
        DogHouse.remove(spot);
        //then
        Assert.assertNull(DogHouse.getDogById(1));
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogById(){
        //given
        String ActualName = "Spot";
        Date birthDate = new Date();
        Integer id = 1;
        Dog spot = new Dog(ActualName,birthDate,id);
        //when
        DogHouse.add(spot);
        Dog spotClone = DogHouse.getDogById(id);
        //then
        Assert.assertEquals(ActualName,spotClone.getName());
        Assert.assertEquals(birthDate,spotClone.getBirthDate());
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
