package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addTest() {
        //given
        Cat mittens = new Cat("mittens", new Date(), 1);
        Integer actualCats = 1;
        //when
        CatHouse.add(mittens);
        Integer numberOfCats = CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(numberOfCats, actualCats);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeWithID() {
        //given
        Integer idToBeRemoved = 1;
        Cat mittens = new Cat("mittens", new Date(), 1);
        //when
        CatHouse.add(mittens);
        CatHouse.remove(1);
        //then
        Assert.assertNull(CatHouse.getCatById(1));
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatById(){
        //given
        String ActualName = "Mittens";
        Date birthDate = new Date();
        Integer id = 1;
        Cat mittens = new Cat(ActualName,birthDate,id);
        //when
        CatHouse.add(mittens);
        Cat mittensClone = CatHouse.getCatById(id);
        //then
        Assert.assertEquals(ActualName,mittensClone.getName());
        Assert.assertEquals(birthDate,mittensClone.getBirthDate());
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void  getNumberOfCats(){
        //given
        String name = "mittens";
        Date birth = new Date();
        CatHouse.add(new Cat(name,birth,0));
        CatHouse.add(new Cat(name,birth,1));
        //when
        Integer test = CatHouse.getNumberOfCats();
        Integer expectedCats = 2;
        //then
        Assert.assertEquals(expectedCats,test);

    }

    //TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeWithObject() {
        //given
        Integer idToBeRemoved = 1;
        Cat mittens = new Cat("mittens", new Date(), 1);
        //when
        CatHouse.add(mittens);
        CatHouse.remove(mittens);
        //then
        Assert.assertNull(CatHouse.getCatById(1));
    }
}
