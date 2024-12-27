package com.deep.RestAPI_P01.service.impl;

import com.deep.RestAPI_P01.dto.Person;
import com.deep.RestAPI_P01.service.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    Person amit=new Person("Amit", "Nagpur", "M", 25, "B.Tech");
    Person sujit=new Person("Sujit", "Dhule", "M", 21, "BCA");
    Person neha=new Person("Neha", "Pune", "F", 22, "MCA");
    Person ayushi=new Person("Ayushi", "Mumbai", "F", 24, "MBA");
    Person angle_priya=new Person("Angle Priya", "Nanded", "F", 28, "BA");

    List<Person> personList=new ArrayList<>();

    @Value("${user.gender}")
    String userGender;

    @Override
    public List<Person> getAllPersonData() {
        personList.add(amit);
        personList.add(sujit);
        personList.add(neha);
        personList.add(ayushi);
        personList.add(angle_priya);

        return personList;
    }

    @Override
    public List<Person> filterDataBasedOnGen(List<Person> personList) {
        List<Person> per = new ArrayList<>();

        for(Person obj: personList) {
            if(!userGender.equalsIgnoreCase(obj.getGender())) {
                per.add(obj);
            }
        }
        return per;
    }
}
