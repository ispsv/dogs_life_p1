package com.db.grad.javaapi.service;

import com.db.grad.javaapi.repository.DogsRepository;

public class DogHandler {
    private DogsRepository itsDogRepo;
    public DogHandler(DogsRepository itsDogRepo) {
        this.itsDogRepo = itsDogRepo;
    }
}