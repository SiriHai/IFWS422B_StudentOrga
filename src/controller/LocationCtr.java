package controller;

import model.*;
import modelaccount.*;

public class LocationCtr {
    public static void main(String[] args) throws Exception {
        Location loc1 = new Location("Fürstenallee", 5, 33102, "Paderborn");
        Location loc2 = new Location("Meisenstraße", 92, 33607, "Bielefeld");

        //Location.newInputDialogue(loc1);
        System.out.println(loc1.toString());
        //loc2.newInputDialogue();
        System.out.println(loc2.toString());

        Person student1 = new Student("Justin", "Bieber", 1994, loc1);
		Person student2 = new Student("Phil", "Collins", 1951,new Location("Rathenaustraße", 3, 33102, "Paderborn"));
	    
        System.out.println(student1);
		System.out.println(student2);
		System.out.println(student1.getResidence().getStreet());

        Account account1 = new SavingsAccount(student1);
        student1.setAccount(account1);
        account1.bookPos(301.20);
        System.out.println(student1.getAccount().getSaldo());
        System.out.println(account1.getSaldo());
    }
}
