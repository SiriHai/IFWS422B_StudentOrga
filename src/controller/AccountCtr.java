package controller;

import modelaccount.*;

/**
 * AccountCtr: verwendet Account
 * 
 * @author Iris Hanheide
 */

public class AccountCtr {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHello, Account!\n");

        // Press CTRL + ALT
        // Konstruktor: owner, Saldo, interest
        SavingsAccount sb1 = new SavingsAccount("Iris Hanheide", 10000, 1000);
        sb1.setTransactionLimit(1000);
        System.out.println(sb1);
        //System.out.println("Check Iban: " + Account.checkIban(sb1.getIban()) + "\n");

        SavingsAccount.setNextNo(1122334400L);

        SavingsAccount sb2 = new SavingsAccount("Ice Cream");
        System.out.println(sb2);
        //System.out.println("Check Iban: " + Account.checkIban(sb2.getIban()) + "\n");

        SavingsAccount sb3 = new SavingsAccount("Ice Cream");
        System.out.println("Vergleich sb3 und sb2: " + sb3.equals(sb2));

        sb3.setAccountNo(1122334400L);
        System.out.println(sb3.toString());
        //System.out.println("Check Iban : " + sb3.getIban() + ": " + Account.checkIban(sb3.getIban()) + "\n");

        // Konstruktor: owner, saldo, overdraftAmount
        CheckingAccount g1 = new CheckingAccount("Iris Hanheide", 1000, 2000);
        System.out.println(g1.toString());
        //System.out.println("Check Iban: " + Account.checkIban(g1.getIban()) + "\n");

        CheckingAccount g2 = new CheckingAccount("Udo Lindenberg", 10000, 20000);
        System.out.println(g2.toString());
        //System.out.println("Check Iban: " + Account.checkIban(g2.getIban()) + "\n");

        System.out.println("Buchungen für " + sb1.getOwner() + " " + sb1.getClass());
        System.out.println("Saldo: " + sb1.getSaldo());
        sb1.bookNeg();   
        sb1.bookPos();
        System.out.println("Saldo: " + sb1.getSaldo());
        double in = 100;
        double out = 100;
        System.out.println("Zubuchung von " + in);
        sb1.bookPos(in);
        System.out.println("Abbuchung von " + out);
        sb1.bookNeg(out);
        System.out.println("Saldo: " + sb1.getSaldo() + "\n");
       
        System.out.println("Buchungen für " + g2.getOwner() + " " + g2.getClass());
        System.out.println("Saldo: " + g2.getSaldo());
        g2.bookPos();
        g2.bookNeg();        
        System.out.println("Saldo: " + g2.getSaldo());
        in = 1000;
        out = 35000;
        System.out.println("Zubuchung von " + in);
        g2.bookPos(in);
        System.out.println("Abbuchung von " + out);
        g2.bookNeg(out);
        System.out.println("Saldo: " + g2.getSaldo());  
    }
}
