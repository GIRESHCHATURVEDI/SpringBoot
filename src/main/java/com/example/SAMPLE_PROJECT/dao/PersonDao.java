package com.example.SAMPLE_PROJECT.dao;

import com.example.SAMPLE_PROJECT.model.Person;

import java.util.UUID;

public interface PersonDao {

    int insertPerson (UUID id , Person person) ;
    default int addPerson (Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson (id, person);

    }
}
