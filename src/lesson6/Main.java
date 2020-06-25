package lesson6;

import lesson33.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // ArrayList
        List<Person> list = new ArrayList<>(); // list to str

        Person person1 = new Person("White");
        Person person2 = new Person("BLack");

        list.add(person1); // добавление эл в list
        list.add(person2);
        list.add(person2);
        list.add(person2);
        list.add(person1);

        Person personFirst = list.get(0);// извлечение эл по индексу
        Person personSecond = list.get(1);// извлечение эл по индексу

        boolean remove = list.remove(person1); // remove to list return boolean
        System.out.println(remove);
        System.out.println(list);

        System.out.println(list.size()); // len(list)

        System.out.println(list.contains(person1)); // проверка есть ли в list person1

        //list.toArray(); // преведение list к array

        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) { // проверка есть ли в итераторе еще элементы
            Person next = iterator.next();
            System.out.println(next);
        }

        // LinkedList

        LinkedList<Person> listL = new LinkedList<>(); // list to str

        Person person1L = new Person("White");
        Person person2L = new Person("BLack");


    }

}

