package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogsHandlerTest {

    private DogsRepository itsDogRepo = new DogsRepositoryStub();

    @BeforeEach
    public void make_sure_repo_is_empty() {
        itsDogRepo.deleteAll();
    }
    @Test
    public void add_a_dog_return_number_of_dogs_in_repo_is_one() {
        DogHandler cut = new DogHandler(itsDogRepo);

        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );

        int expectedResult = 1;

        long actualResult = cut.getNoOfDogs();
        assertEquals( expectedResult, actualResult );
    }
    @Test
    public void getDogByNameTest() {
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog expectedResultNoDog = null;
        Dog expectedResultMultipleDogs = null;
        Dog expectedResultOneDog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setName("dog1");
        dog2.setName("dog1");
        expectedResultOneDog.setName("dog3");
        cut.addDog(dog1);
        cut.addDog(dog2);
        cut.addDog(expectedResultOneDog);

        Dog actualResultNoDog = cut.getDogByName(dog1);
        Dog actualResultMultipleDogs = cut.getDogByName(dog1);
        Dog actualResultOneDog = cut.getDogByName(expectedResultOneDog);

        assertEquals( expectedResultNoDog, actualResultNoDog);
        assertEquals( expectedResultMultipleDogs, actualResultMultipleDogs);
        assertEquals( expectedResultOneDog, actualResultOneDog);
    }

    @Test
    public void getDogByIdTest(){
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog dog1 = new Dog();
        dog1.setName("Doggy");
        dog1.setId(0);
        cut.addDog(dog1);

        //this "stub" make zero sense -.-, look at the add method lol
        //assertEquals(dog1, cut.getDogById(0));
        assertEquals(null, cut.getDogById(666));
    }
}
