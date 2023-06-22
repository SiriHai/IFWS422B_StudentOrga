package controller;

import java.util.Scanner;
import model.Student;

/**
 * Demo-Programm für Student
 * 
 * @author Iris Hanheide
 */

public class StudentCtr {

    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.setName("Nathan Evans");
        student1.setId(1001);

        Student student2 = new Student();
        student2.setName("Miksu Macloud");
        student2.setId(1002);

        System.out.println(student1.getName() + "\t" + student1.getId());
        System.out.println(student2.info());

        // Einlesen von der Konsole
        Scanner sc = new Scanner(System.in);
        
        Student student3 = new Student();
        System.out.print("Name: \t");
        String name3 = sc.next();
        student3.setName(name3);
       
        System.out.print("ID: \t");
        int id3 = sc.nextInt();
        student3.setId(id3);
    
        sc.close();
        
        System.out.println();
        System.out.println(student3.getName() + "\t" + student3.getId());
        
        // Konstruktor
        Student student4 = new Student("Friday", 1003);
        System.out.println(student4.getName() + "\t\t" + student4.getId());
    }

}
