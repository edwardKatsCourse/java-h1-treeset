package com.company;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private String name;
    private String city;


    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        System.out.printf("equals -> %s - %s", this.name, this.city);

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        System.out.printf("hashCode -> %s - %s\n", this.name, this.city);

        return Objects.hash(name, city);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, City: %s",
                this.name,
                this.city);
    }

    /**
     * 1 - first param bigger
     * -1 - first param is smaller
     * 0 - they are equal
     */
    @Override
    public int compareTo(Person that) {
        System.out.printf("compareTo %s-%s | %s-%s\n",
                this.name, this.city,
                that.getName(), that.getCity());
        //this -> that = по возрастанию a..z | 0..100
        //this <- that (that -> this) = по убыванию z..a | 100..0
        int result = this.getName().compareTo(that.getName());
        if (result == 0) {
            result = this.getCity().compareTo(that.getCity());
        }

        return result;
    }

    public static Person [] getPersons() {
        return new Person[] {
            new Person("John", "Tel-Aviv"),
            new Person("Jane", "Kefar Yona"),
            new Person("Jane", "Kefar Sava"),
            new Person("Jane", "Ashdod"),
            new Person("Jane", "Ashdod"),
            new Person("Yosi", "Haifa"),
            new Person("Shir", "Raanana"),
            new Person("Shir", "Raanana"),
            new Person("David", "Raanana"),
            new Person("Oren", "Haifa"),
            new Person("Oren", "Haifa")
        };
    }
}
