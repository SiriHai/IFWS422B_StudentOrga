package modelaccount;

/**
 * Girokonto: abgeleitet von Konto
 * 
 * @author Iris Hanheide
 */

public class CheckingAccount extends Account {
    private double overdraftAmount; // Überziehungsrahmen

    private static final long FIRST_NO = 1_000_000_000L;
    private static final long LAST_NO = 1_999_999_999L;
    private static final int MISTAKE_NO = 1;

    private static long nextNo = FIRST_NO;

    @Override
    public long fetchNextNo(){
        return nextNo;
    }
    
    @Override
    public long fetchLAST_NO(){
        return LAST_NO;
    }
    
    @Override
    public void incNextNo(){
        nextNo++;
    }

    @Override
    public long fetchMISTAKE_NO(){
        return MISTAKE_NO;
    }

    // Konstruktoren
    // Jedes Konto soll mindestens einen Owner und eine Kontonummer haben,
    // deshalb verzichte ich auf den Standardkonstruktor

    public CheckingAccount(String owner) {
        super(owner);
    }

    public CheckingAccount(String owner, double saldo) {
        super(owner, saldo);
    }

    public CheckingAccount(String owner, double saldo, double overdraftAmount) {
        this(owner, saldo);
        this.overdraftAmount = overdraftAmount;
    }

    // Getter und Setter
    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public static long getNextNo() {
        return (nextNo);
    }

    public static void setNextNo(long nextAccountNo) {
        CheckingAccount.nextNo = nextAccountNo;
    }

    // Kein equals, Elternmethode wird verwendet
    // einziges vergleichbares Attribut: overdraftAmount

    @Override
    public String toString() {
        return super.toString() + " CheckingAccount [overdraftAmount=" + overdraftAmount + "]";
    }

    // Überschreiben der Methode, da mit Bedingung
    @Override
    public void bookNeg(double amount) {
        if (super.getSaldo() - amount >= -overdraftAmount) {
            super.bookNeg(amount);
        } else {
            System.out.println("Aktion nicht durchführbar, Dispo von " + overdraftAmount + " überzogen.");
        }
    }

}
