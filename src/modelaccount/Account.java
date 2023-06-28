package modelaccount;

import java.util.Scanner;

/**
 * Ü5: Aufgabe 1.1
 * Account: Elternklasse
 * 
 * @author Iris Hanheide
 */

public class Account {
    private long accountNo;

    private String iban;
    private String owner;
    private double saldo;

    protected Scanner sc = new Scanner(System.in);

    // Konstruktoren
    // Jedes Konto soll mindestens einen Owner und eine Kontonummer haben,
    // deshalb verzichte ich auf den Standardkonstruktor von außen
    protected Account() {
    }

    public Account(String owner) {
        this.owner = owner;
    }

    public Account(String owner, double saldo) {
        this(owner);
        this.saldo = saldo;
    }

    // Getter und Setter
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (accountNo != other.accountNo)
            return false;
        if (iban == null) {
            if (other.iban != null)
                return false;
        } else if (!iban.equals(other.iban))
            return false;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", iBan=" + iban + ", owner=" + owner + ", saldo=" + saldo + "]";
    }

    // Buchungen
    public void book(double amount) {
        saldo += amount;
    }

    public void bookPos(double amount) {
        if (amount > 0)
            book(amount);
        else
            printMistake();
    }

    public void bookNeg(double amount) {
        if (amount >= 0)
            book(-amount);
        else
            printMistake();
    }

    private void printMistake() {
        System.out.println("Mistake: Betrag negativ.");
    }

    // Abfragen über die Konsole
    public void bookPos() {
        System.out.print("Wie viel soll eingezahlt werden? ");
        bookPos(sc.nextDouble());
    }

    public void bookNeg() {
        System.out.print("Wie viel soll abgehoben werden? ");
        bookNeg(sc.nextDouble());
    }

}
