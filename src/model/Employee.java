package model;

public interface Employee {
    int kostenstelle = 1231; // automatisch public, final und static

    // automatisch public und abstract
    void setPersNo(int persNo);
    int getPersNo();
    String getFunction();

    default void print(){
        System.out.println("Der Mitarbeiter hat die Funktion " + getFunction());
    }

}
