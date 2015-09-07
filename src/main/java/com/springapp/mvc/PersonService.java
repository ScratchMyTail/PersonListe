package com.springapp.mvc;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by christerhansen on 07.09.15.
 */

@Service
public class PersonService {
    public List<Person> getPersoner(){
        ArrayList<Person> personList = new ArrayList<Person>();
        Person p1 = new Person("Per", "Olson");
        Person p2 = new Person("Klasse", "Jonnson");
        Person p3 = new Person("Jokke", "Mokk");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        return personList;
    }
}
