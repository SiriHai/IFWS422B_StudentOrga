package controller;

import model.Lecturer;

public class LecturerCtr {
    public static void main(String[] args) {
        Lecturer lect1 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect1.info());

        Lecturer lect2 = new Lecturer("Liese", "Prysselius");
        System.out.println(lect2.info());

        Lecturer lect3 = new Lecturer();
        System.out.println(lect3.info());
    }

}
