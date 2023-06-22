package demo;
/**
 * Demo-Programm Strings
 * 
 * @author Iris Hanheide
 */

public class StringDemo {
    public static void main(String[] args) throws Exception {
        String s1 = "FHDW";
        String s2 = "FHDW";
        String s_1 = new String("FHDW");
        String s_2 = new String("FHDW");
        System.out.println(s1 == s2); // true
        System.out.println(s_1 == s_2); // false
        System.out.println(s1 == s_1); // false
        System.out.println(s1.equals(s_1)); // true

    }
}
