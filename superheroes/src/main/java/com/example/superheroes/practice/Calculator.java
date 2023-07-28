package com.example.superheroes.practice;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
@Component
public class Calculator {
    @PostConstruct
    public void init() {
        System.out.println("Bean Calc has been created!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Been Calculator will be destroyed");
    }
    public int addition(int num1, int num2) {
        return num1 + num2;
    }
}
