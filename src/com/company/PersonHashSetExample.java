package com.company;

import java.util.Arrays;
import java.util.HashSet;

public class PersonHashSetExample {

    public static void main(String[] args) {

        HashSet<Person> people = new HashSet<>(Arrays.asList(Person.getPersons()));

        System.out.println(people);
    }
}
