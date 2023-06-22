package demo;

/**
 * Demo-Programm Konto
 * 
 * @author Iris Hanheide
 */

public class Konto {
	private int kontonummer;
	private double saldo;

	// statische Methode
	public static void zahleEin(double betrag, Konto kto) {
		// Zusätzlich wird der Betrag um 100 erhöht.
		betrag += 100.;
		kto.setSaldo(betrag);
	}

	// Instanzmethode
	public void zahleEin(double betrag) {
        saldo += betrag;
    }

	public int getKontonummer() {
		return kontonummer;
	}

	public void setKontonummer(int nr) {
		kontonummer = nr;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double betrag) {
		saldo = betrag;
	}

	public String info() {
		return "Kontonummer: " + kontonummer + ", Saldo: " + saldo;
	}

	public static void main(String[] args) {

		double wert = 1000.;
		Konto konto = new Konto();

		System.out.println("Vorher: wert=" + wert + " saldo="  +  konto.getSaldo());

		Konto.zahleEin(wert, konto);

		System.out.println("Nachher: wert=" + wert + " saldo="  + konto.getSaldo());

		konto.zahleEin(1000);
		System.out.println(konto.info());
	}

}
