package com.company;

import java.util.Arrays;
import java.util.TreeSet;

public class PersonTreeSetExample {

    public static void main(String[] args) {
        //String [] -> List<String>
        //Person [] -> List<Person>

        /**
         * 1. Запустится и напечатается в отсортированном виде
         * 2. Запустится и напечатается в не отсортированном виде
         * 3. Запустится, но ничего не напечатается
         * 4. Упадет с ошибкой
         * 5. Что-то еще пойдет не так...
         * 6. Запустится и что-то напечатается
         */
        TreeSet<Person> people = new TreeSet<>(Arrays.asList(Person.getPersons()));

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("--------------------");

        System.out.printf("Total %s people in TreeSet", people.size());
        System.out.println();

        //Comparable c = person
    }
}
