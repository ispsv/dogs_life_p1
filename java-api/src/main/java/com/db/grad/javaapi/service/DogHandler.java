package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;

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
}