package com.deep.RestAPI_P01.controller;

import com.deep.RestAPI_P01.dto.Person;
import com.deep.RestAPI_P01.service.PersonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TinderController {

    @Autowired
    PersonService personService;

    @GetMapping("/getPersons")
    public List<Person> getAllPerson() {
        List<Person> allPersonData = personService.getAllPersonData();
        List<Person> filterData = personService.filterDataBasedOnGen(allPersonData);
        return filterData;
    }

    @PostMapping("/create-person")
    public Person createUser(@RequestBody Person person) throws JsonProcessingException {

    //    ObjectMapper object=new ObjectMapper();
    //    String dataJson = object.writeValueAsString(person);

    //    return "Data inserted successfully\n" + dataJson;
        return person;
    }
}