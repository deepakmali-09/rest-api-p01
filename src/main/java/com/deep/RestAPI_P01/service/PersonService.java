package com.deep.RestAPI_P01.service;
import com.deep.RestAPI_P01.dto.Person;
import java.util.List;

public interface PersonService {
    List<Person> getAllPersonData();

    List<Person> filterDataBasedOnGen(List<Person> personList);
}
