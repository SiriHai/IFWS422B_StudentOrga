package demo_enum;

public enum Ampelfarbe {
    ROT("Stopp"), 
    GELB("Achtung"), 
    GRUEN("Fahren"),
    KEINE_FARBE("keine Farbe");

    String answer;

    private Ampelfarbe(){}

    private Ampelfarbe(String answer){
        this.answer = answer;
    }

    public String toString() {
		return answer;
	}

    public static Ampelfarbe parseAmpelfarbe(String answer){
        for (Ampelfarbe farbe : Ampelfarbe.values()){
            if (answer.equals(farbe.answer))
                return farbe;
        }
        return KEINE_FARBE;
    }
    
}
