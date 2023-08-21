package demo_enum;

public class Ampeldemo {
    public static void main(String[] args) {
        // statische Methode der äußeren Klasse
		System.out.println(Ampelfarbe.ROT.toString());
		System.out.println(Ampelfarbe.GELB);
		System.out.println(Ampelfarbe.GRUEN);

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
        System.out.println(Ampelfarbe.parseAmpelfarbe("Stopp").name());	
    }
}
