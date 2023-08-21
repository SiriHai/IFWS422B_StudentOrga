package controller;

import model.*;
import modelaccount.*;

public class AccountsDemo {
    public static void main(String[] args) throws Exception {

        Location fhdw1 = new Location("Fürstenallee", 1, 33102, "Paderborn");

        Student student1 = new Student("Nathan", "Evans", 1994, fhdw1);
        Student student2 = new Student("Miksu", "Macloud", 1987);
        Student student3 = new Student("Ed", "Sheeran", 1991);
        Student student4 = new Student("Katy", "Perry", 1984);

        Account a1 = new SavingsAccount(student1);
        Account a2 = new SavingsAccount(student2);
        Account a3 = new SavingsAccount(student3);
        Account a4 = new SavingsAccount(student4);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        Things<Account> accounts = new Things<Account>(3);
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);
        accounts.add(a4);
        // Account 2 wird gelöscht
        accounts.remove(a2);
        // jetzt wird Account 2 nicht mehr gefunden
        accounts.remove(a2);
        accounts.add(new SavingsAccount(new Student("Orlando", "Bloom", 1977)));

        accounts.print();

        accounts.remove("Orlando", "Bloom");
        accounts.remove("Orlando", "Bloom");
        accounts.print();

    }

}
