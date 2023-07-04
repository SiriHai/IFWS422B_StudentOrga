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
        Student student1 = new Student("Nathan", "Evans", 1987, "Bielefeld", "WI");

        Student student2 = new Student("Nathan", "Evans", 1987, "Bielefeld", "AI");

        System.out.println(student1.equals(student2));

        System.out.println(student1.getName() + "\t" + student1.getId());
        System.out.println(student2);

        // Neu: Aufruf von newInputDialogue aus Person
        // 1. Instanmethode
        Student student3 = new Student();
        student3.newInputDialogue();
        System.out.println(student3);

        // 2. statische Methode
        Student student4 = new Student();
        // Student.newInputDialogue(student4);
        // wurde Klasse Person importiert ist auch folgendes möglich
        Person.newInputDialogue(student4);
        System.out.println(student4);

        Person student5 = new Student("Luciano", "Schmidt", 1999);
        Person person5 = new Student("Luciano", "Schmidt", 1999);

        System.out.println(student5.equals(person5));
        System.out.println(person5.equals(student5));
        
        
        
        
        System.out.println(((Student) student5).getId());
        System.out.println(student5);

        System.out.println("Es wurden " + Student.getAnzahl() + " Studenten angelegt.");
    }

}
