package com.company;

import java.util.TreeSet;

public class IntegerStringTreeSetExample {

    public static void main(String[] args) {

        //Set - коллекция без дубликатов
        //HashSet - выявлеяет дубликаты при помощи hash
        //LinkedHashSet - тоже, что и HashSet, но помнит, кто за кем был добавлен

        //TreeSet - еще и сортирует (не работает с hash code)
        TreeSet <Integer> digits = new TreeSet<>();

        digits.add(10);
        digits.add(-1);
        digits.add(15);
        digits.add(11);
        digits.add(11);
        digits.add(22);
        digits.add(22);
        digits.add(22);
        digits.add(144);
        digits.add(-10645);

        System.out.println("Числа в TreeSet");
        System.out.println(digits);
        System.out.println();
        System.out.println();

        TreeSet<String> letters = new TreeSet<>();
        letters.add("y");
        letters.add("x");
        letters.add("w");
        letters.add("h");
        letters.add("g");
        letters.add("f");
        letters.add("e");
        letters.add("z");
        letters.add("d");
        letters.add("c");
        letters.add("b");
        letters.add("a");
        System.out.println("Буквы в TreeSet");
        System.out.println(letters);
    }
}
