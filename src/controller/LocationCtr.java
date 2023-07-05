package controller;

import model.*;

public class LocationCtr {
    public static void main(String[] args) throws Exception {
        Location loc1 = new Location("Fürstenallee", 5, 33102, "Paderborn");
        Location loc2 = new Location("Meisenstraße", 92, 33607, "Bielefeld");

        Location.newInputDialogue(loc1);
        System.out.println(loc1.toString());
        loc2.newInputDialogue();
        System.out.println(loc2.toString());
        
    }
}
