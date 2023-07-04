package controller;

import model.Person;
import model.Staff;

public class StaffCtr {
    public static void main(String[] args) {
        Staff staff1 = new Staff();
        staff1.newInputDialogue();
        System.out.println(staff1);

        Staff.newInputDialogue(staff1);
        System.out.println(staff1);

        Person.newInputDialogue(staff1);
        System.out.println(staff1);


        Person staff2 = new Staff();
        staff2.newInputDialogue();
        System.out.println(staff2.toString());

        Staff.newInputDialogue(staff2);
        System.out.println(staff1);

        Person.newInputDialogue(staff1);
        System.out.println(staff1);
    }

}
