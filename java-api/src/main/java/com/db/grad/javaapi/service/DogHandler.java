package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

import java.util.List;

public class DogHandler {
    private DogsRepository itsDogRepo;
    public DogHandler(DogsRepository itsDogRepo) {
        this.itsDogRepo = itsDogRepo;
    }

    public Long addDog(Dog dog) {
        return this.itsDogRepo.save(dog);
    }

    public Long getNoOfDogs() {
        return this.itsDogRepo.count();
    }

    public Dog getDogByName(Dog dog) {
        List<Dog> result = this.itsDogRepo.findByName(dog);

        if (result.size() == 0 || result.size() > 1) {
            return null;
        } else {
            return result.get(0);
        }
    }

    public Dog getDogById(long id) {
        return this.itsDogRepo.findById(id);
    }
}