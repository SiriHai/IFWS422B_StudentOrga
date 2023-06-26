package controller;

import model.Lecturer;
import model.Person;

public class LecturerCtr {
    public static void main(String[] args) {
        Lecturer lect1 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect1.info());

        Lecturer lect2 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect2.info());

        // Einlesen von der Konsole

        // // Neu: Aufruf von newInputDialogue aus Person
        // // 1. Instanmethode
        // Lecturer lect3 = new Lecturer();
        // lect3.newInputDialogue();
        // System.out.println(lect3.info());

        // 2. statische Methode
        Lecturer lect4 = new Lecturer();
        // Lecturer.newInputDialogue(lect4);
        // wurde Klasse Person importiert ist auch folgendes möglich
        Person.newInputDialogue(lect4);
        System.out.println(lect4.info());      
        
    }

}
