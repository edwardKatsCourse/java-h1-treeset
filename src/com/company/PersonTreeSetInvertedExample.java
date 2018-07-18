package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class PersonTreeSetInvertedExample {

    public static void main(String[] args) {
        //Comparator
        TreeSet<Person> people = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
//                return o2.compareTo(o1);
                int result = o2.getName().compareTo(o1.getName());
                if (result == 0) {
                    result = o2.getCity().compareTo(o1.getCity());
                }
                return result;
            }
        });

        people.addAll(Arrays.asList(Person.getPersons()));

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("--------------------");

        System.out.printf("Total %s people in TreeSet", people.size());
        System.out.println();
    }
}
