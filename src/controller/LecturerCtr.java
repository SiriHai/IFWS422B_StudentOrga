package controller;

import model.Lecturer;

public class LecturerCtr {
    public static void main(String[] args) {
        Lecturer lect1 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect1);

        Lecturer lect2 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect2);

        System.out.println(lect1.equals(lect2));   
        
    }

}
