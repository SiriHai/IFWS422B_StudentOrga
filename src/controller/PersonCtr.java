package controller;

import model.Person;

public class PersonCtr {
    public static void main(String[] args) {

        Person person1 = new Person("Pippi", "Langstrumpf", 1950);
        System.out.println(person1.info());
        person1.newInputDialogue();
        System.out.println(person1.info());

        Person person2 = new Person();
        person2.newInputDialogue();
        System.out.println(person2.info());

        Person.newInputDialogue(person2);
        System.out.println(person2.info());

    }

}
