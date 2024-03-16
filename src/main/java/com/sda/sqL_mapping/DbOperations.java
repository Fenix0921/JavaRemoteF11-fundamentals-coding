package com.sda.sqL_mapping;

import com.sda.sqL_mapping.entity.PersonEntity;

import java.util.Collections;
import java.util.List;

public class DbOperations {
    // CRUD

    // Read all / Select
    public List<PersonEntity> readAllPersons(){
        // TODO
        return Collections.emptyList();
    }

    public PersonEntity readById(Long personId){
        // TODO
        return null;
    }

    // Create / Insert clause
    public PersonEntity savePerson(PersonEntity personToSave){
        // personToSave without id

        // return person with update id
        // TODO
        return null;
    }

    //Delete / Delete clause
    public boolean deletePersonById(Long id) {
        //id of person to delete
        // return:
        //true - object was deleted
        //false - object wasn't deleted
        //TODO
        return false;
    }

    //Update / Update Clause
    public PersonEntity updatePerson(PersonEntity toUpdate){
        //TODO
        return null;
    }
}
