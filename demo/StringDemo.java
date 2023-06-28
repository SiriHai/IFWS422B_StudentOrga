package demo;
/**
 * Demo-Programm Strings, Version2
 * Weitere Beispiele zum Arbeiten mit Strings
 * @author Iris Hanheide
 */

public class StringDemo {
    public static void main(String[] args) throws Exception {
        String s1 = "FHDW";
        String s2 = "FHDW";
        String s1a = new String("FHDW");
        String s2a = new String("FHDW");
        String s3 = null;
        
        System.out.println(s1 == s2); // true
        System.out.println(s1a == s2a); // true
        System.out.println(s1a == s2a); // false
        System.out.println(s1 == s1a); // false
        System.out.println(s1.equals(s1a)); // true

        System.out.println(s3);

        System.out.println("length: " + s1.length());
        System.out.println("concat: " + s1.concat(s2)); 
        System.out.println("+ : " + s1 + s2);
        System.out.println("indexOf: " + s1.indexOf('H'));
        System.out.println("replace: " + s1.replace('F','f'));
        
        System.out.println("ToLowerCase: " + "AbCdE".toLowerCase());
        System.out.println("ToUpperCase:" + "fhdw".toUpperCase());
        System.out.println("substring: " + "FHDW".substring(1,2));
        System.out.print("String.format: ");
        System.out.println(String.format("%02d %3.2f %s ab", 3, 4.2, s1));                
    }
}
