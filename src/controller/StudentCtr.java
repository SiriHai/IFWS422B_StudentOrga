package controller;

import model.Person;
//import java.util.Scanner;
import model.Student;

/**
 * Demo-Programm für Student
 * 
 * @author Iris Hanheide
 */

public class StudentCtr {

    public static void main(String[] args) throws Exception {
        Student student1 = new Student("Nathan", "Evans", 1987, 1001);

        Student student2 = new Student("Miksu", "Macloud", 1987, 1002);

        System.out.println(student1.getName() + "\t" + student1.getId());
        System.out.println(student2.info());

        // Neu: Aufruf von newInputDialogue aus Person
        // 1. Instanmethode
        Student student3 = new Student();
        student3.newInputDialogue();
        System.out.println(student3.info());

        // 2. statische Methode
        Student student4 = new Student();
        // Student.newInputDialogue(student4);
        // wurde Klasse Person importiert ist auch folgendes möglich
        Person.newInputDialogue(student4);
        System.out.println(student4.info());

        System.out.println("Es wurden " + Student.getAnzahl() + " Studenten angelegt.");
    }

}
