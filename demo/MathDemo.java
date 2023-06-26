package demo;
public class MathDemo {

    public static void main(String[] args) {
        // Konstanten 
        System.out.println("Pi = " + Math.PI);
        System.out.println("e = " + Math.E);
        
        // Rechnen
        System.out.println(Math.log10(1000));
        
        double x = 3.5, y = 2.;
		double abstand = Math.hypot(x, y);
		System.out.println("Abstand: " + abstand);

		double radius = 2.;
		double flaeche = Math.PI * Math.pow(radius, 2);
        System.out.println("Kreisflaeche mit Radius " 
            + radius + ": " + flaeche);

        //Runden
		System.out.println("Aufrunden 3.6: " + Math.ceil(3.6));
		System.out.println("Abrunden -3.6: " + Math.floor(-3.6));
		System.out.println("Runden 3.6: " + Math.round(3.6));

    }
    
}
