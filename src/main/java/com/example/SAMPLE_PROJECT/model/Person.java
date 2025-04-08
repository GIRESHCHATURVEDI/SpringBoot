package com.example.SAMPLE_PROJECT.model;

import java.util.UUID;

public class Person {
    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    private final UUID id ;
   private final String name ;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

