package modelaccount;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Ü5: Aufgabe 1.1
 * Account: Elternklasse
 * 
 * @author Iris Hanheide
 */

public abstract class Account {
    private long accountNo;

    private String iban;
    private String owner;
    private double saldo;

    protected Scanner sc = new Scanner(System.in);

    private static final String COUNTRY_CODE = "DE";
    private static final String COUNTRY = "1314";
    private static final String CODE_NUMBER = "30050110";

    protected abstract long fetchNextNo();
    protected abstract long fetchLAST_NO();
    protected abstract void incNextNo();
    protected abstract long fetchMISTAKE_NO();

    // Kontonummer erzeugen
    protected void makeNewAccountNo() {
        long nextNo = fetchNextNo();
        if (nextNo <= fetchLAST_NO()) {
            accountNo = nextNo;
            incNextNo();
        } else {
            System.out.println("Sparbuch Nummernbereich überschritten");
            accountNo = fetchMISTAKE_NO();
        }
        makeIban();
    }
    
    private static int calcCheckDigit(long accountNo) {
        String check = String.format("%s%010d%s00", CODE_NUMBER, accountNo, COUNTRY);
        BigInteger checkDigit = new BigInteger(check);
        checkDigit = checkDigit.mod(new BigInteger("97"));
        return 98 - Integer.parseInt(checkDigit.toString());
    }

    protected void makeIban() {
        int pruef = calcCheckDigit(accountNo);
        this.iban = String.format("%s%02d%s%010d", COUNTRY_CODE, pruef, CODE_NUMBER, accountNo);
    }

    // Konstruktoren
    // Jedes Konto soll mindestens einen Owner und eine Kontonummer haben,
    // deshalb verzichte ich auf den Standardkonstruktor von außen
    protected Account() {
        makeNewAccountNo();
    }

    public Account(String owner) {
        this();
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
        makeIban();
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

        return true;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", iBan=" + iban + ", owner=" + owner + ", saldo=" + saldo + "]";
    }

    public static boolean checkIban(String iban) {
        String country = iban.substring(0,2);
        if (!country.equals(COUNTRY_CODE))
            return false;
        
        String pruef = iban.substring(2, 4);
        String codeNumber = iban.substring(4, 12);
        String accountNo = iban.substring(12, 22);

        BigInteger checkDigit = new BigInteger(codeNumber + accountNo + COUNTRY + pruef);
        
        return checkDigit.mod(new BigInteger("97")).intValue() == 1;
    }

    // Buchungen
    private void book(double amount) {
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
