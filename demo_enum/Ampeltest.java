package demo_enum;

public class Ampeltest {
	
	// enum als "innere Klasse"
	private enum Ampelfarbe {
		ROT, GELB, GRUEN
	}
	
	// Methode der äußeren Klasse
	public static void info(Ampelfarbe farbe) {
		switch (farbe) {
			case ROT:
				System.out.println("Stopp");
				break;
			case GELB:
				System.out.println("Achtung");
				break;
			case GRUEN:
				System.out.println("Fahren");
				break;
		}
	}

	public static void main(String[] args) {
		// statische Methode der äußeren Klasse
		info(Ampelfarbe.ROT);
		info(Ampelfarbe.GELB);
		info(Ampelfarbe.GRUEN);

		System.out.println();

		// Standardmethoden des Enums
		System.out.println(Ampelfarbe.ROT);
		System.out.println(Ampelfarbe.ROT.toString());
		System.out.println(Ampelfarbe.ROT.name());
		System.out.println(Ampelfarbe.ROT.ordinal());

		System.out.println();

		for (Ampelfarbe farbe : Ampelfarbe.values()){
			System.out.println(farbe);
		}		
	}
}
