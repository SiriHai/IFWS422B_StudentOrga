package demo;

public class Isbn {

    // Hier wird der Prüfalgorithmus für die ersten 9 Ziffern berechnet
    private static int pruef(String isbn){
        int zahl = 0; 
        for ( int i = 0; i < 9; i++ ){
            zahl += Integer.parseInt(isbn.substring(i, i+1)) * (i+1);
        }
        return zahl % 11;
    }
    
    public static String makeIsbn(int land, int publisher, int bookno){
        String isbn = String.format("%1d%03d%05d", land, publisher, bookno);
        int psum = pruef(isbn);          
        
        if (psum == 10)
            return String.format("%d-%03d-%05d-X", land, publisher, bookno);
        else 
            return String.format("%d-%03d-%05d-%1d", land, publisher, bookno, psum);
            
        //return String.format("%d-%03d-%05d-%s", land, publisher, bookno, (psum == 10) ? "X": String.format("%d", psum));
    }

    public static boolean checkIsbn(String isbn){
        // alle '-' entfernen
        isbn = isbn.replaceAll("-","");
    
        int psum = pruef(isbn);
        String z10 = isbn.substring(9,10);
        
        if (z10.toLowerCase().equals("x"))
            return psum == 10;
        else 
            return psum == Integer.parseInt(z10); 
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, ISBN!");
        
        String isbn1 = makeIsbn(3,868,94111);
        System.out.println(isbn1);
        System.out.println(checkIsbn(isbn1));

        String isbn2 = makeIsbn(3,499,13599);
        System.out.println(isbn2);
        System.out.println(checkIsbn(isbn2));

        System.out.println(checkIsbn("3868941118"));
    }
}
