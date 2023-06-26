package controller;

import model.Person;

public class PersonCtr {
    public static void main(String[] args) {
        Person person1 = new Person("Pippi", "Langstrumpf", 1950);
        Person person2 = new Person("Pippi", "Langstrumpf", 1950);
        Person person3 = person1;

        System.out.println(person1 == person2); // false
        System.out.println(person1 == person3); // true
        System.out.println(person1.equals(person2)); // true
        System.out.println(person1.equals(person3)); // true

        System.out.println(person1);
        System.out.println(person1.toString());


    }

}
