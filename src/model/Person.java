package model;
import java.util.Scanner;

public class Person {
    private String firstName, lastName;
    private int birth;

    private static Scanner sc = new Scanner(System.in);

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birth) {
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

    public void newInputDialogue() {
        System.out.print("firstName: ");
        firstName = sc.nextLine();
        System.out.print("lastName: ");
        lastName = sc.nextLine();
        System.out.print("birth: ");
        birth = sc.nextInt();
        sc.nextLine();
    }

    public static void newInputDialogue(Person person) {
        System.out.print("firstName: ");
        person.firstName = sc.nextLine();
        System.out.print("lastName: ");
        person.lastName = sc.nextLine();
        System.out.print("birth: ");
        person.birth = sc.nextInt();
        sc.nextLine();
    }

    public String info(){
        return "firstName " + firstName + ", lastName " + lastName + ", birth " + birth;
    }

}
