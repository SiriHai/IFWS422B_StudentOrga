package model;

public class Lecturer extends Person {
     public Lecturer() {

    }

    public Lecturer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Lecturer(String firstName, String lastName, int birth) {
        super(firstName, lastName, birth);
    }

    public Lecturer(String firstName, String lastName, int birth, String city) {
        super(firstName, lastName, birth, city);
    }

    @Override
    public String toString() {
        return super.toString() + " Lecturer [] ";
    }

    @Override
    protected void newInput() {
        System.out.println("New lecturer ");
    }

    

}
