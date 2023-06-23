package model;

public class Lecturer {
    private String firstName, lastName;
    private int birth;

    public Lecturer() {
    }

    public Lecturer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Lecturer(String firstName, String lastName, int birth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

     public String info(){
        return "firstName " + firstName + ", lastName " + lastName + ", birth " + birth;
    }

}
